const search=document.getElementById("search");
search.addEventListener("click",()=>{
    search.removeAttribute("placeholder");
})

const button=document.getElementById("btn");
button.addEventListener("click",()=>{
    const input=document.getElementById("search").value;
    document.getElementById(input).scrollIntoView();
    document.getElementById("search").value=""; 
})


const labels=document.querySelectorAll('.box label');
labels.forEach(label=>(
    label.innerHTML=label.innerText.split('').map((letter,idx)=>`<span style="transition-delay:${idx*50}ms">${letter}</span>`).join('')))


const gallary=document.getElementById('gallary');
const gallarybox=document.getElementById('gallarybox');
window.addEventListener('scroll',box);
function box()
{
    const bottom=window.innerHeight/2;
    const total=window.innerHeight/1.5;
    const gallarytop=gallary.getBoundingClientRect().top;
    const gallarybottom=gallary.getBoundingClientRect().bottom;
    gallarybox.classList.add('active')
    if(gallarytop<=bottom && gallarybottom>total )
    {
        gallarybox.classList.remove('active');
    }
    else if(gallarybottom<total && gallarytop<=bottom)
    {
        gallarybox.classList.add('active');
    }    
}

const mainnn=document.getElementById('about');
const madd=document.getElementById('mainnn');
const info=document.getElementById('info');
const para=document.getElementById('para');
window.addEventListener('scroll',about)
function about()
{
    const bottom=window.innerHeight/2;
    const total=window.innerHeight/1.5;
    const mtop=mainnn.getBoundingClientRect().top;
    const mbottom=mainnn.getBoundingClientRect().bottom;
    const infotop=info.getBoundingClientRect().top;
    const infobottom=info.getBoundingClientRect().bottom;
    const paratop=para.getBoundingClientRect().top;
    const parabottom=para.getBoundingClientRect().bottom;
    madd.classList.add('removephoto');
    info.classList.add('removeinfo');
    para.classList.add('removeinfo');
    if(mtop<=bottom && mbottom>total )
    {
        madd.classList.remove('removephoto');
        info.classList.remove('removeinfo');
        para.classList.remove('removeinfo');
    }
    else if(mbottom<total && mtop<=bottom)
    {
        madd.classList.add('removephoto');
        info.classList.add('removeinfo');
        para.classList.add('removeinfo');
    } 
}