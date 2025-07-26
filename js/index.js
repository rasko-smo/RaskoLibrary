fetch('../html/header.html')
    .then((response) => response.text())
    .then((data) => document.querySelector('#header').innerHTML = data);
fetch('../html/footer.html')
    .then((response) => response.text())
    .then((data) => document.querySelector('#footer').innerHTML = data);