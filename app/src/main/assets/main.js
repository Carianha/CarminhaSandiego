/*
<br/>
<input type="button" value="Say hello" onClick="showAndroidToast('Hello Android!')" />
*/
function showAndroidToast(toast) {
    AndroidInterface.showToast(toast);
}

var inicio = [
"De:Agência Central Multi Espacial\rPara:Detetive Literário\r\nAssunto:Temos um caso para você.\r\n",
"Você deve encontrar o vilão antes que ele cause danos irreversíveis na história literária."
];

    var estado=0;
    var estadoFim = inicio.length;

    var buttonHTML = "<button onclick='start()'>Começar</button>";

    var writeSpeed = 50;

    document.getElementById("transcribe").innerHTML= "";

/*
    // Listen to click to stop animation
    var transcribeSearchbox = document.querySelector("#transcribe");
    transcribeSearchbox.addEventListener("click", function(event) {
  		stopAnimation(transcribeSearchbox);
      event.preventDefault();
    });
*/

    // Main function
    function startAnimation(quotes, passo, writeSpeed)
    {
      // Simulates text typing
      var write_text = function(quoteIndex, charIndex) {
        var quote = quotes[quoteIndex];

        document.getElementById("transcribe").innerHTML+= quote[charIndex];
        document.getElementById("transcribe").scrollTop = document.getElementById("transcribe").scrollHeight;
        charIndex++;
        if(charIndex == quote.length) {
        	charIndex=0;
            document.getElementById("somMaquina").pause();
            quoteIndex++;
            estado= quoteIndex;
            if (estado == estadoFim) {
            	document.getElementById("botaoInicio").innerHTML="Investigar";
            	document.getElementById("botaoInicio").style.display="block";
            }
            else{
            	document.getElementById("botaoInicio").innerHTML="Continuar >>";
            	document.getElementById("botaoInicio").style.display="block";
            }
         }
         else
          setTimeout(function() {write_text(quoteIndex, charIndex)}, writeSpeed);


      }

      // Start animation
      setTimeout(function() { write_text(passo, 0) }, writeSpeed);

    }

    // Start!
    function start()
    {

        document.getElementById("botaoInicio").style.display="none";

        if (estado!=estadoFim){
            document.getElementById("somMaquina").play();
            startAnimation(inicio, estado, writeSpeed);
          }
        else
            AndroidInterface.showToast();

    }