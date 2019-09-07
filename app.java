
"language";
"javascript"; 


const euro = document.getElementById('euro');
const gbp = document.getElementById('gbp');
const dollar = document.getElementById('dollar');
const yen = document.getElementById('yen');

euro.addEventListener('input' ,euTodlgpyn,
                  function euTodlgpyn({
const eu = parseInt(euro.value);
const dl = 1.11*eu;
const gp = 0.9*eu;
const yn = 117.94*eu;
dollar.value = dl;
gbp.value = gp;
yen.value=yn}))
                  
dollar.addEventListener('input', dlToeugpyn,
                  function dlToeugpyn({
const dl = parseFloat(dollar.value);
const eu = 0.9*dl;
const gp = 0.81*dl;
const yn = 106.92*dl;
euro.value = eu;
gbp.value = gp;
yen.value=yn;
                  }))
                  
gbp.addEventListener('input', gpToeudlyn,
                  function gpToeudlyn({
const gp = parseFloat(gbp.value);
const dl = 1.23*gp;
const eu = 1.1*gp;
const yn = 131.35*gp;
dollar.value = dl;
euro.value = eu;
yen.value= yn;
                  }))
                  
yen.addEventListener('input', ynToeudlgp,
                  function ynToeudlgp({
const yn = parseFloat(yen.value);
const dl = 0.0094*yn;
const gp = 0.0076*yn;
const eu = 0.0084*yn;
dollar.value = dl;
gbp.value = gp;
euro.value= eu;
                  }))
                  
function main(){
euTodlgpyn();
dlToeugpyn();
gpToeudlyn();
ynToeudlgp();
}}