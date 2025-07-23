class NewsPaperRunner{

public static void main(String []paper){
System.out.println("THE MAIN STARTED");

NewsPaper newsPaper=new NewsPaper();
newsPaper.newsPaperId=1;
newsPaper.noOfPages=12;
newsPaper.language="English";
newsPaper.date="20-07-2025";
newsPaper.day="Tuesday";
newsPaper.companyName="The Times Of India";

System.out.println("the news      paper id" +newsPaper.newsPaperId);
System.out.println("the no of pages" +newsPaper.noOfPages);
System.out.println("the language" +newsPaper.language);
System.out.println("the today date is" +newsPaper.date);
System.out.println("the day is" +newsPaper.day);
System.out.println("the company name is" +newsPaper.companyName);

NewsPaper newsPaper1=new NewsPaper();
newsPaper1.newsPaperId=2;
newsPaper1.noOfPages=12;
newsPaper1.language="Kannada";
newsPaper1.date="20-07-2025";
newsPaper1.day="Tuesday";
newsPaper1.companyName="udayavani";

System.out.println("the news      paper id" +newsPaper1.newsPaperId);
System.out.println("the no of pages" +newsPaper1.noOfPages);
System.out.println("the language" +newsPaper1.language);
System.out.println("the today date is" +newsPaper1.date);
System.out.println("the day is" +newsPaper1.day);
System.out.println("the company name is" +newsPaper1.companyName);


System.out.println("THE MAIN ENDED");
}
}