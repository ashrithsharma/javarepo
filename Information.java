package may_18;

import java.util.Scanner;
public class Information {
int choice;
int item;
int type;
static int fullcream=40;
static int toned=29;
static int lowfat=27;
int curd;
int paneer;
static int curd200=15;
static int curd500=48;
static int curdbox=55;
int buttermilk;
static int sachet=8;
static int polypack=25;
int lassi;
static int lassisachet=10;
static int lassipack=30;
static int  paneer200=110;
static int paneer500=450;
int billcase,quant,curd200bill,curd500bill;
int fullcreambill,tonedbill,lowfatbill;
int quant1,quant2,quant3,quant4,quant5,quant6,quant7,quant8,quant9,quant10;
int quant11,sachetbill;
int curdboxbill,polybill,sachetlassibill,lassipackbill,paneer200bill,paneer500bill;
int decision;


void info()
{
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("       *--------------------------------------------------------------------------------------------------*");
	System.out.println();
	
	System.out.println("       *--------------------------------------------------------------------------------------------------*");
	System.out.println();
	
	System.out.println("       *               *******          *        *     *    *        *      *                             *");
	System.out.println("       *               *                * *    * *     *    *        *    *                               *");
	System.out.println("       *               *                *   * *  *     *    *        *  *                                 *");
	System.out.println("       *               *******   ****   *    *   *     *    *        *  *                                 *");
	System.out.println("       *               *                *        *     *    *        *    *                               *");
	System.out.println("       *               *                *        *     *    *        *      *                             *");
	System.out.println("       *               *******          *        *     *    *******  *       *                            *");
	System.out.println("       *--------------------------------------------------------------------------------------------------*");
	System.out.println();
	
	System.out.println("       *--------------------------------------------------------------------------------------------------*");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("                                                ONLINE MILK BUYING PLATFORM                                 ");
	}
void menu() {
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("         1)Catalog");
	System.out.println();
	
	System.out.println("         2)Ordering & Billing");
	System.out.println();
	
	System.out.println("         3)Home delivery's");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println();
	System.out.println();
	Scanner sc=new Scanner(System.in);
	choice=sc.nextInt();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	
	switch(choice)
	{
	
	
	case 1:System.out.println("                              Hi mate! make you're first order now !");
	new Information().Firstorder();
	break;
	case 2:System.out.println("Generate you're Monthly bill");
	new  Information().generator();
	break;
	case 3:System.out.println("we also offer home deliveries!contact \n 9878654532 \n 8798546545");
	System.out.println();
	System.out.println();
	
	Firstorder();
	break;
	default:System.out.println("invalid choice");
	}
}
void Firstorder(){
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("       WELCOME ! We are a family now");
	System.out.println();
	
	System.out.println("       choose the below items to buy");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("        1)MilK");
	System.out.println();
	
	System.out.println("        2)Curd");
	System.out.println();
	
	System.out.println("        3)Buttermilk");
	System.out.println();
	
	System.out.println("        4)Lassi");
	System.out.println();
	
	System.out.println("        5)Paneer");
	System.out.println();
	
	System.out.println("        6)Main menu                                                                                        ");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	Scanner sc=new Scanner(System.in);
	item=sc.nextInt();
	switch(item)
	{
	case 1:Milk();
	
	break;
	case 2:Curd();
	break;
	case 3:Buttermilk();
	break;
	case 4:Lassi();
	break;
	case 5:Paneer();
	break;
	case 6:menu();
	break;
	default:System.out.println("invalid choice");
	}
	System.out.println("Continue the process In Billing & ordering process !");
}
void Milk() {
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("       You've selected milk to buy, choose a type of milk you want ");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("       1)full cream milk");
	System.out.println();
	
	System.out.println("       2)Toned milk");
	System.out.println();
	
	System.out.println("       3)Low fat milk");
	System.out.println();
	
	System.out.println("       4)catalog menu");
	System.out.println();
	
	System.out.println("       5)Main menu");
	System.out.println();
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	System.out.println();
	
	Scanner sc=new Scanner(System.in);
	type=sc.nextInt();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	
	switch(type)
	{
	case 1:System.out.println("each packet Costs"+fullcream+"rs");
	System.out.println("enter quantity");
	Scanner sc9=new Scanner(System.in);
	quant=sc9.nextInt();
	fullcreambill=quant*fullcream*30;
	System.out.println();
	System.out.println();
	
	System.out.println("The bill for the total days:  "+fullcreambill);
	System.out.println();
	System.out.println();
	System.out.println();
	
	System.out.println();
	System.out.println();
	
	menu();
	       break;
	case 2:System.out.println("each packet Costs"+toned+"rs");
	System.out.println("enter quantity");
	Scanner sc1=new Scanner(System.in);
	quant1=sc1.nextInt();
	tonedbill=quant1*toned*30;
	System.out.println();
	System.out.println();
	
	System.out.println("The bill for the total days:  "+tonedbill);
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	
	menu();
	       break;
	case 3:System.out.println("each packet Costs "+lowfat+"rs");
	System.out.println("enter quantity");
	Scanner sc11=new Scanner(System.in);
	quant1=sc11.nextInt();
	lowfatbill=quant1*lowfat*30;
	System.out.println();
	System.out.println();
	
	System.out.println("The bill for the total days:  "+lowfatbill);
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	
	menu();
	     	break;
	case 4:System.out.println();
	System.out.println();
	
		Firstorder();
	break;
	case 5:
		System.out.println();
		System.out.println();
		
		menu();
	break;
	default:System.out.println();
	System.out.println();
	
		System.out.println("invalid choice");
	}
	

}
void Curd()
{
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("        You've selected Curd to buy, choose a type of curd you want ");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println("        1)200grms curd ");
	System.out.println();
	
	System.out.println("        2)500grms curd");
	System.out.println();
	
	System.out.println("        3)500grms cord box");
	System.out.println();
	
	System.out.println("        4)Catalog menu");
	System.out.println();
	
	System.out.println("        5)Main menu   ");
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	

	Scanner sc=new Scanner(System.in);
	curd=sc.nextInt();
	
	switch(curd) {
	case 1:System.out.println("200grms curd packet is  "+""+curd200+"rs");
	System.out.println();
	System.out.println();
	System.out.println("enter quantity");
	Scanner sc7=new Scanner(System.in);
	quant3=sc7.nextInt();
	curd200bill=quant3*curd200*30;
	System.out.println();
	System.out.println();
	
	System.out.println("The bill for the total days:  "+curd200bill);
	System.out.println();
	System.out.println();
	System.out.println();
	
	System.out.println();
	System.out.println();
	
	Firstorder();
	break;
	case 2:System.out.println("500grms curd packet is:  "+curd500+"rs");
	System.out.println();
	System.out.println("enter quantity");
	Scanner sc6=new Scanner(System.in);
	quant4=sc6.nextInt();
	curd500bill=quant4*curd500*30;
	System.out.println();
	System.out.println();
	
	System.out.println("The bill for the total days:  "+curd500bill);
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	
	Firstorder();
	break;
	case 3:System.out.println("500grms box is  "+curdbox+"rs");
	System.out.println();
	System.out.println("enter quantity");
	Scanner sce=new Scanner(System.in);
	quant5=sce.nextInt();
	curdboxbill=quant5*curdbox*30;
	System.out.println();
	System.out.println();
	System.out.println("The bill for the total days:  "+curdboxbill);
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	
	Firstorder();
	break;
	case 4:
		System.out.println();
		System.out.println();
		Firstorder();
	break;
	case 5:System.out.println();
	System.out.println();
	
		menu();
	break;
	default:
		System.out.println();
		System.out.println();
		
		System.out.println("invalid choice");
	}
	
}
void Buttermilk() {
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	
	System.out.println("You've selected  Butter-milk to buy, choose a type of butter-milk you want ");
	System.out.println();
	
	System.out.println("1)sachet");
	System.out.println();
	
	System.out.println("2)Polypack");
	System.out.println();
	
	System.out.println("3)Main menu");
	System.out.println();
	

	Scanner sc=new Scanner(System.in);
	buttermilk=sc.nextInt();
	switch(buttermilk) {
	case 1:System.out.println("sachet costs  "+sachet+"rs");
	System.out.println();
	System.out.println();;
	System.out.println("The bill for the total days:  "+sachetbill);
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	Firstorder();
	break;
	case 2:System.out.println("polypack costs of  "+polypack+"rs");
System.out.println();

System.out.println();
System.out.println();
	System.out.println("enter quantity");
	Scanner sc5=new Scanner(System.in);
	quant7=sc5.nextInt();
	polybill=quant7*polypack*30;
	System.out.println();
	System.out.println();
	System.out.println("The bill for the total days:  "+polybill);
	System.out.println();
	System.out.println();
	System.out.println();
	
	Firstorder();
	System.out.println();
	System.out.println();
	
	Firstorder();
	break;
	case 3:System.out.println();
	System.out.println();
	
		Firstorder();
	default:
		System.out.println();
		System.out.println();
		System.out.println("invalid choice");
	break;
	}

}
void Lassi()
{
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	System.out.println();
	
	System.out.println("       You've selected Lassi to buy, choose a type of lassi you want ");
	System.out.println();
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	System.out.println();
	
	System.out.println();
	System.out.println("       1)lassi sachet");
	System.out.println();
	
	System.out.println("       2)Lassi polypack");
	System.out.println();
	System.out.println();
	
	System.out.println("       3)Main menu");
	System.out.println();
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");

	Scanner sc=new Scanner(System.in);
	lassi=sc.nextInt();
	switch(lassi) {
	case 1:System.out.println("lassi sachet csosts  "+lassisachet);
	System.out.println("enter quantity");
	Scanner sc4=new Scanner(System.in);
	quant8=sc4.nextInt();
	sachetlassibill=quant8*lassisachet*30;
	System.out.println("The bill for the total days:  "+sachetlassibill);
	System.out.println();
	System.out.println();
	Firstorder();
	
	System.out.println();
	System.out.println();
	
	Firstorder();
break;
	case 2:System.out.println("lassi polypack  "+lassipack);
	System.out.println("enter quantity");
	Scanner sc41=new Scanner(System.in);
	quant9=sc41.nextInt();
	lassipackbill=quant9*lassipack*30;
	System.out.println("The bill for the total days:  "+lassipackbill);
	System.out.println();
	System.out.println();
	Firstorder();
	System.out.println();
	System.out.println();
	
	Firstorder();
	break;
	case 3:
		System.out.println();
		System.out.println();
		Firstorder();
	
	}
}
void Paneer() {
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	System.out.println();
	
	System.out.println("       You've selected panner to buy, choose a type of paneer you want ");
	System.out.println();
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	
	System.out.println();
	
	System.out.println("        1)paneer 200grms");
	System.out.println();
	
	System.out.println("        2)paneer 500grms");
	System.out.println();
	
	System.out.println("        3)Main menu");
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	System.out.println();
	
	System.out.println("       ****************************************************************************************************");
	System.out.println();
	System.out.println();
	

	Scanner sc=new Scanner(System.in);
	paneer=sc.nextInt();
switch(paneer) {
case 1:System.out.println("paneer 200 grms costs  "+paneer200+"rs");
System.out.println();
System.out.println();
System.out.println("enter quantity");
Scanner sc4=new Scanner(System.in);
quant10=sc4.nextInt();
sachetlassibill=quant10*paneer200*30;
System.out.println("The bill for the total days:  "+paneer200bill);
System.out.println();
System.out.println();
Firstorder();
System.out.println();
System.out.println();

Firstorder();
break;
case 2:System.out.println("paneer 500 grms costs  "+paneer500+"rs");
System.out.println("enter quantity");
Scanner sc41=new Scanner(System.in);
quant8=sc41.nextInt();
paneer500bill=quant8*paneer500*30;
System.out.println("The bill for the total days:  "+paneer500bill);
System.out.println();
System.out.println();
Firstorder();
System.out.println();
System.out.println();

Firstorder();
break;
case 3:Firstorder();
System.out.println();
System.out.println();

default:
	System.out.println();
	System.out.println();
	System.out.println("invalid input");

}
	
}
void generator()
{
	System.out.println("       ****************************************************************************************************");
	System.out.println("       ****************************************************************************************************");
	System.out.println("         1)full cream milk");
	System.out.println();
	
	System.out.println("         2)Toned milk");
	System.out.println();
	
	System.out.println("         3)Low fat milk");
	System.out.println();
	
	System.out.println("         4)200grms curd ");
	System.out.println();
	
	System.out.println("         5)500grms curd");
	System.out.println();
	
	System.out.println("         6)500grms cord box");
	System.out.println();
	
	System.out.println("         7)buttermilk-sachet");
	System.out.println();
	
	System.out.println("         8)nuttermilk-Polypack");
	System.out.println();
	
	System.out.println("         9)lassi sachet");
	System.out.println();
	
	System.out.println("         10)Lassi polypack");
	System.out.println();
	
	System.out.println("         11)paneer 200grms");
	System.out.println();
	
	System.out.println("         12)paneer 500grms");
	System.out.println("       ****************************************************************************************************");
	System.out.println("       ****************************************************************************************************");

	Scanner bill=new Scanner(System.in);
	billcase=bill.nextInt();
	switch(billcase) {
	case 1:System.out.println("enter quantity");
	Scanner sc9=new Scanner(System.in);
	quant=sc9.nextInt();
	fullcreambill=quant*fullcream*30;
	System.out.println();
	System.out.println();
	
	System.out.println("The bill for the total days:  "+fullcreambill);
	System.out.println();
	System.out.println();
	System.out.println();
	address("Full cream milk");
	System.out.println();
	System.out.println();
	System.out.println();
	Firstorder();
break;
	case 2:System.out.println("enter quantity");
	Scanner sc=new Scanner(System.in);
	quant1=sc.nextInt();
	tonedbill=quant1*toned*30;
	System.out.println();
	System.out.println();
	
	System.out.println("The bill for the total days:  "+tonedbill);
	System.out.println();
	System.out.println();
	System.out.println();
	address("Toned milk");
	System.out.println();
	System.out.println();
	System.out.println();
	Firstorder();
	break;
	case 3:System.out.println("enter quantity");

	Scanner sc8=new Scanner(System.in);
	quant2=sc8.nextInt();
	lowfatbill=quant2*lowfat*30;
	System.out.println();
	System.out.println();
	
	System.out.println("The bill for the total days:  "+lowfatbill);	
	System.out.println();
	System.out.println();
	System.out.println();
	address("Low fat Milk");
	System.out.println();
	System.out.println();
	System.out.println();
	Firstorder();
	break;
	case 4:System.out.println("enter quantity");
	Scanner sc7=new Scanner(System.in);
	quant3=sc7.nextInt();
	curd200bill=quant3*curd200*30;
	System.out.println();
	System.out.println();
	
	System.out.println("The bill for the total days:  "+curd200bill);
	System.out.println();
	System.out.println();
	System.out.println();
	address("Curd 200grms");
	System.out.println();
	System.out.println();
	System.out.println();
	Firstorder();
	break;
	case 5:System.out.println("enter quantity");
	Scanner sc6=new Scanner(System.in);
	quant4=sc6.nextInt();
	curd500bill=quant4*curd500*30;
	System.out.println();
	System.out.println();
	
	System.out.println("The bill for the total days:  "+curd500bill);
	System.out.println();
	System.out.println();
	System.out.println();
	address("Curd 500grms");
	System.out.println();
	System.out.println();
	System.out.println();
	Firstorder();
	break;
	case 6:System.out.println("enter quantity");
	Scanner sce=new Scanner(System.in);
	quant5=sce.nextInt();
	curdboxbill=quant5*curdbox*30;
	System.out.println();
	System.out.println();
	System.out.println("The bill for the total days:  "+curdboxbill);
	System.out.println();
	System.out.println();
	System.out.println();
	address("Curd box");
	System.out.println();
	System.out.println();
	System.out.println();
	Firstorder();
	break;
	case 7:System.out.println("enter quantity");
	Scanner scc=new Scanner(System.in);
	quant6=scc.nextInt();
	sachetbill=quant6*sachet*30;
	System.out.println();
	System.out.println();
	
	System.out.println("The bill for the total days:  "+sachetbill);
	System.out.println();
	System.out.println();
	System.out.println();
	address("Butter-milk 200ml sachet");
	System.out.println();
	System.out.println();
	System.out.println();
	Firstorder();
	break;
	case 8:System.out.println("enter quantity");
	Scanner sc5=new Scanner(System.in);
	quant7=sc5.nextInt();
	polybill=quant7*polypack*30;
	System.out.println();
	System.out.println();
	System.out.println("The bill for the total days:  "+polybill);
	System.out.println();
	System.out.println();
	System.out.println();
	address("Butter-milk poly pack");
	System.out.println();
	System.out.println();
	System.out.println();
	Firstorder();
	break;
	case 9:System.out.println("enter quantity");
	Scanner sc4=new Scanner(System.in);
	quant8=sc4.nextInt();
	sachetlassibill=quant8*lassisachet*30;
	System.out.println("The bill for the total days:  "+sachetlassibill);
	System.out.println();
	System.out.println();
	address("Lassi Sachet");
	System.out.println();
	System.out.println();
	System.out.println();
	Firstorder();
	break;
	case 10:System.out.println("enter quantity");
	Scanner sc2=new Scanner(System.in);
	quant9=sc2.nextInt();
	lassipackbill=quant9*lassipack*30;
	System.out.println();
	System.out.println();
	System.out.println("The bill for the total days:  "+lassipackbill);
	System.out.println();
	System.out.println();
	System.out.println();
	address("Lassi Poly pack");
	System.out.println();
	System.out.println();
	System.out.println();
	Firstorder();
	break;
	case 11:System.out.println("enter quantity");
	System.out.println();
	
	Scanner sc1=new Scanner(System.in);
	quant10=sc1.nextInt();
	paneer200bill=quant10*paneer200*30;
	System.out.println();
	System.out.println();
	
	System.out.println("The bill for the total days:  "+paneer200bill);
	System.out.println();
	System.out.println();
	System.out.println();
	address("Paneer 200grms");
	System.out.println();
	System.out.println();
	System.out.println();
	Firstorder();
	break;
	case 12:	System.out.println("enter quantity");
	Scanner sc3=new Scanner(System.in);
	quant11=sc3.nextInt();
	paneer500bill=quant11*paneer500*30;
	System.out.println();
	System.out.println();
	System.out.println("The bill for the total days:  "+paneer500bill);
	System.out.println();
	System.out.println();
	System.out.println();
	address("Panner 500grms");
	System.out.println();
	System.out.println();
	System.out.println();
	Firstorder();
	break;
	default:
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("invalid inputs");
		}
}

void address(String x)
{
	System.out.println("Enter you're details for you're order in our Dairy ");
	System.out.println();
	System.out.println();
	
	System.out.println("Enter name : ");
	Scanner nam=new Scanner(System.in);
	String name=nam.nextLine();
	System.out.println();
	System.out.println();
	
	System.out.println("Enter no : ");
	Scanner nam1=new Scanner(System.in);
	String number=nam1.nextLine();
	System.out.println();
	System.out.println();
	
	System.out.println("Enter address : ");
	Scanner nam11=new Scanner(System.in);
	String addr=nam11.nextLine();
	System.out.println();
	System.out.println();
	
	System.out.println("Enter email or gmail or outlook account :");
	Scanner nam3=new Scanner(System.in);
	String email=nam3.nextLine();
	System.out.println("-----------------------------------------------------------------------------------------------------");
	System.out.println();
	System.out.println("                                           BILL DETAILS                                               ");
	System.out.println();
	System.out.println("   Name="+name+"                                                                                     ");
	System.out.println();
	System.out.println("   Number="+number+"                                                                                 ");
	System.out.println();
	System.out.println("   address="+addr);
	System.out.println();
	System.out.println("   Email="+email);
	System.out.println();
	System.out.println("   Product="+x);
	System.out.println("-----------------------------------------------------------------------------------------------------");
	
	
	System.out.println("choose payment mode:-");
	System.out.println();	
	System.out.println();
	System.out.println();
	System.out.println("1)Phonepay");
	System.out.println();
	System.out.println("2)Google pay");
	System.out.println();
	System.out.println("3)E-pay");
	System.out.println();
	System.out.println("4)Cash on delivery");
	System.out.println();
	Scanner choice=new Scanner(System.in);
	int cho=choice.nextInt();
	
	switch(cho)
	{
	case 1:System.out.println("Open Gmail and have a click on link which  redirects yourself for payment page in Phonepay !");
	System.out.println();	
	System.out.println();
	break;
	case 2:System.out.println("Open Gmail and have a click on link which  redirects yourself for payment page in Googlepay !");
	System.out.println();
	System.out.println();
	break;
	case 3:System.out.println("Account no: 7588421564827458 \n IFSC Code:BARNOJKUSK \n branch:Begumpet");
	System.out.println();	
	System.out.println();
	System.out.println();
	System.out.println("Note:Save details for further E -transactions");
	
	break;
	case 4:System.out.println("our delivery guy will collect money from you ! please ensure proper change for the smooth experience,\n \n we'll further msg to  "+number +" about delivery person details");
	System.out.println();
	System.out.println();
	
	break;
	default:
		System.out.println();
		System.out.println();
		System.out.println("Choose valid payment method !");
	}
	
	
	  
	
}
public static void main(String[] args) {
Information i1=	new Information();
i1.info();
i1.menu();

}
}
