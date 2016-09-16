var stompClient = null;

var POKEMON_TPL =
    '<div class="col-md-3">' +
        '<div class="card pokemon">' +
            '<div class="crop-img crop-img-middle crop-img-center" style="height: 150px;">' +
                '<img class="image-shiny" src="{2}" />' +
            '</div>' +
            '<div class="user-icon user-icon-xl icon-{1}" style="border: 4px solid #FFF; margin: -48px auto 0; position: relative;">' +
                '<span class="hide">{1}</span>' +
            '</div>' +
            '<div class="card-block" style="text-align: center;">' +
                '<h3 style="margin:0;">{0}</h3>' +
                '<h5>Type</h5>' +
                '<p class="type-{1}">{1}</p>' +
            '</div>' +
        '</div>' +
    '</div>';

function connect() {
    var socket = new SockJS('http://localhost:8070/pokedex-websocket');

    stompClient = Stomp.over(socket);

    stompClient.connect(
        {},
        function (frame) {
            stompClient.subscribe(
                '/pokedex/pokemons',
                function (pokemon) {
                    showPokemon(JSON.parse(pokemon.body));
                }
            );
        }
    );
}

function showPokemon(pokemon) {
    var data = [pokemon.name, pokemon.type, pokemon.smallImageURL];

    var pattern = new RegExp('{([0-' + data.length + '])}','g');

    var content = POKEMON_TPL.replace(
        pattern,
        function(match, index) {
            return data[index];
        }
    );

    $("#pokemonList").append(content);
}

$(function () {
    connect();
});