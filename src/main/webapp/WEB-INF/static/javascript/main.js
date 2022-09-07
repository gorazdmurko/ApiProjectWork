// let ajax = document.createElement('script');
// ajax.src = 'https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js';
// ajax.type = 'text/javascript';
// document.getElementsByTagName('head')[0].appendChild(ajax);
//
// let jquery = document.createElement('script');
// jquery.src = 'https://code.jquery.com/jquery-latest.min.js';     // https://code.jquery.com/jquery-3.4.1.min.js
// jquery.type = 'text/javascript';
// document.getElementsByTagName('head')[1].appendChild(jquery);
//
// let ui = document.createElement('script');
// ui.src= 'https://code.jquery.com/ui/1.11.2/jquery-ui.js';
// ui.type = 'text/javascript';
// document.getElementsByTagName('head')[2].appendChild(ui);


$(document).ready(function() {
    // validate if Drzave id already exists
    $("#idDrzave").change(function() {
        $.ajax({
            url: 'validateIdDrzave',
            data: { id: $("#idDrzave").val() },
            success: function(responseText) {
                if (responseText != "") {
                    $("#errorMessage").text(responseText);
                    // popup
                    // if confirmed bellow lines
                    $("#idDrzave").focus();
                    let input = document.getElementById("idDrzave");
                    input.value = "";
                    input.style.background = "red";
                    setTimeout(() => {
                        $("#errorMessage").text("");
                        input.style.background = "white";
                    }, 1000);
                }
            }
        });
    });

    // delete Drzave by id
    $("#deleteState").click(function(e) {
        console.log("Delete invoked!");
        console.log(e);
        $.ajax({
            url: 'deleteDrzava',
            data: { id: $("#drzavaId").val() },
            success: function(response) {
                if (response != "") {
                    console.log("Država NI izbrisana");
                } else {
                    console.log("Država izbrisana");
                }
            }
        });
    })

    // validate if PostneStevilke id already exists
    $("#idPostneStevilke").change(function () {
        $.ajax({
            url: 'validateIdPostneStevilke',
            data: { id : $("#idPostneStevilke").val() },
            success: function(responseText) {
                if (responseText != "") {
                    $("#error").text(responseText);
                    $("#idPostneStevilke").focus();
                    let input = document.getElementById("idPostneStevilke");
                    input.value = "";
                    input.style.background = "red";
                    setTimeout(() => {
                        $("#error").text("");
                        input.style.background = "white";
                    }, 1000);
                }
            }
        })
    });
})