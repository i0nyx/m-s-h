var restUrl = "/rest/";
$(document).ready(function () {

    $("#form").submit(function(event){
        sendForm(event);
    })

});

function sendForm(event){
    var name = $('#name').val();
    var email= $('#email').val();
    var password= $('#password').val();
    var json = {
        "name": $('#name').val(),
        "email": $('#email').val(),
        "password": $('#password').val()
    };
    
    $.ajax("/rest/add",{
        contentType: "application/json",
        data: JSON.stringify(json),
        type: "post",
        success: function(){            
            alert("Данные добавлены");            
        },
        error: function(data){            
            console.log("Can't save new user "+ data);
        }
    });
    event.preventDefault();

}
