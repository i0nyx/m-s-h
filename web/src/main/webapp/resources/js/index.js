var restUrl = "/rest/";
$(document).ready(function () {

    $("#form").submit(function(){
        sendForm();
    })

});

function sendForm(){
    var json = {
        "name": $('#name').val(),
        "email": $('#email').val(),
        "password": $('#password').val()
    };
    
    $.ajax(restUrl + "add",{
        contentType: "application/json",
        data: JSON.stringify(json),
        type: "post",
        success: function(){            
            alert("Данные добавлены");
            window.location.reload();
        },
        error: function(data){            
            console.log("Can't save new user " + data);
        }
    });
    event.preventDefault();

}
