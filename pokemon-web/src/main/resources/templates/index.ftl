<!DOCTYPE html>

<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<title>Pokemon</title>
		<meta name="viewport" content="width=device-width, initial-scale=1" />

		<link href="css/main.css" rel="stylesheet" />
		<link href="css/pokemon.css" rel="stylesheet" />

        <script src="/webjars/jquery/jquery.min.js"></script>
        <script src="/webjars/sockjs-client/sockjs.min.js"></script>
        <script src="/webjars/stomp-websocket/stomp.min.js"></script>
        <script src="js/app.js"></script>
	</head>

	<body>
		<div id="main-content" class="container">
			<div class="row">
				<div id="pokemonList">
					<#list pokemons as pokemon>
                        <div class="col-md-3">
							<div class="card pokemon">
								<div class="crop-img crop-img-middle crop-img-center" style="height: 150px;">
									<img class="image-shiny" src="${pokemon.smallImageURL}" />
								</div>

								<div class="user-icon user-icon-xl icon-${pokemon.type}" style="border: 4px solid #FFF; margin: -48px auto 0; position: relative;">
									<span class="hide">${pokemon.type}</span>
								</div>

								<div class="card-block" style="text-align: center;">
									<h3 style="margin:0;">${pokemon.name}</h3>

									<h5>Type</h5>

									<p class="type-${pokemon.type}">${pokemon.type}</p>
								</div>
							</div>
                        </div>
					</#list>
				</div>
			</div>
		</div>
	</body>
</html>