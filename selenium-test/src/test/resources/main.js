
function addMessage(){
    console.log("Test")
    let message = document.createElement('div');
    message.setAttribute("id", "message");
    message.setAttribute("class", "alert alert-success");
    message.setAttribute("role", "alert");
    message.innerHTML  = "Success";
    document.body.appendChild(message);
}