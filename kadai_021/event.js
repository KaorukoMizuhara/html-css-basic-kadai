const text=document.getElementById('text');
const btn=document.getElementById('btn');

function message(){
    btn.addEventListener('click',()=>{
        text.textContent='ボタンをクリックしました';
    });
}

setTimeout(message,2000);