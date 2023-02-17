let hora = Number(prompt("indica la hora: "));

if (hora >= 6 && hora <=11){
    document.write("buenos dias");
} else if (hora >=12 && hora <= 18){
    document.write("buenas tardes");
}else if (hora >=19 && hora <= 23){
    document.write("buenas noches")
}else if (hora >=0  && hora <= 5){
document.write("ya duermete");
}else {
    document.write("Hora no Valida");
}