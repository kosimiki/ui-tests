
function addMessage(){
    console.log("Test")
    let hasErrors = false;
    let firstName = document.getElementById('firstName')
    console.log(firstName);
    if(!firstName.value || firstName.value.length < 2 || firstName.value.length > 50){
        hasErrors = true;
    }

    let message = document.createElement('div');
    message.setAttribute("id", "Message");
    message.setAttribute("role", "alert");
    if(hasErrors){
        message.innerHTML  = "Failed";
        message.setAttribute("class", "alert alert-warning");

    } else {
        message.innerHTML  = "Success";
        message.setAttribute("class", "alert alert-success");
    }

    document.body.appendChild(message);
}