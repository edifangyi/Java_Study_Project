 function   PageDate()   
  {   
  currentDate   =   new  Date()   
  with   (currentDate)   
                      {   
  day=getDay()   
  month=getMonth()+1   
  this.document.classname="sj"   
  this.document.write('�����ǣ�����ʱ��   '+getFullYear()+'��'+month+'��'+getDate()+'��')   
  }   
  if   (day==1){document.write('   ����һ')}   
  if   (day==2){document.write('   ���ڶ�')}   
  if   (day==3){document.write('   ������')}   
  if   (day==4){document.write('   ������')}   
  if   (day==5){document.write('   ������')}   
  if   (day==6){document.write('   ������')}   
  if   (day==0){document.write('   ������')}   
  document.write('<br/>')   
  }   
    
  PageDate()

