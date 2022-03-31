const express = require('express');


// creacion de api
const app = express();


// configuraciones
app.set('port',4000);


// routers
// arrow function
app.get('/home',(req,res)=>{
    var a =2;
    res.send('Bienvenido a mi primera API');
})


app.get('/pokedex',(req,res)=>{
    res.send('Bienvenido a la podex');
})


// funcion en mi compu
app.listen(app.get('port'),()=>{
    console.log('Servidor iniciado en el puerto:  4000 ');
});