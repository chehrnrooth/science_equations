import java.util.Scanner;
import java.io.Console;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Math;


class numbers1 {
	public static void main(String[] args) {
	
	String science_name;
	String physics_field;
	String chemistry_field;
	String physics_equations;
	

	
//Finding field between physics and chemistry
		System.out.println("Enter your field");
		//allows the input of a string
		System.out.println("physics");
		System.out.println("chemistry");
		Scanner in = new Scanner (System.in);
		science_name = in.nextLine();
//physics
		if (science_name.equals("physics")){
			System.out.println("Which physics field?");
			System.out.println("gravity");
			//System.out.println("other - need to code");
			Scanner in1 = new Scanner(System.in);
			physics_field = in.nextLine();
	//gravity
				if (physics_field.equals("gravity")){
					System.out.println("What equation are you trying to find?");
					System.out.println("1) force of gravity - type 1");
					System.out.println("2) orbit time - type 2");
						Scanner in2 = new Scanner(System.in);
						physics_equations = in.nextLine();
		//force of gravity
						if (physics_equations.equals("1")) {
			//constants				
							double gravity_constant = 6.67e-11;
							double acceleration_gravity = 9.81;

							HashMap<String, Double> values_forcesG = new HashMap<String, Double>();
							System.out.printf("Ok, so what are the variables that you know? These are the possibilities (in this order) mass 1, mass 2, radius, if one is not known, put 000 when I ask.");
			//known variables
								Scanner in3 = new Scanner(System.in);
								
								System.out.printf("Enter mass 1");
								double mass1 = in3.nextInt();
								values_forcesG.put("Mass 1 ", mass1);

								System.out.printf("Enter mass 2");
								double mass2 = in3.nextInt();
								values_forcesG.put("Mass 2", mass2);

								System.out.printf("Enter radius");
								double r1 = in3.nextInt();
								values_forcesG.put("Radius", r1);

								System.out.println(values_forcesG);
			//missing variables
									if (mass1 == 000 || mass2 == 000 || r1 == 000) {
										System.out.println("What value are you missing?");
										System.out.println("(1) Mass 1, (2) Mass 2, or (3) Radius");
										Scanner in5 = new Scanner(System.in);
										String which_value_forceofgravity = in5.nextLine();

										System.out.println("Please enter the force of gravity");
										Scanner in6 = new Scanner(System.in);
										double force_of_gravity = in6.nextDouble();
										
											if (which_value_forceofgravity.equals("1")) {
												mass1 = (force_of_gravity*(r1*r1))/(gravity_constant*mass2);
												System.out.println("Mass 1 equals "+ mass1);
												
												double f_of_G = gravity_constant*(mass1*mass2/(r1*r1));
												System.out.println("The force of gravity is "+ f_of_G);
											
											} else if (which_value_forceofgravity.equals("2")) {
												mass2 = (force_of_gravity*(r1*r1))/(gravity_constant*mass1);
												System.out.println("Mass 2 equals "+ mass2);
												
												double f_of_G = gravity_constant*(mass1*mass2/(r1*r1));
												System.out.println("The force of gravity is "+ f_of_G);
											
											} else if (which_value_forceofgravity.equals("3")) {
												r1 = Math.sqrt((gravity_constant*mass1*mass2)/force_of_gravity);
												System.out.println("Radius equals "+ r1);
												
												double f_of_G = gravity_constant*(mass1*mass2/(r1*r1));
												System.out.println("The force of gravity is "+ f_of_G);
											
											} else {

											}
			//no missing variables
									} else {
										double f_of_G = gravity_constant*(mass1*mass2/(r1*r1));
										System.out.println(f_of_G + " is the force of gravity");
									}
		//period of orbit
						} else if (physics_equations.equals("2")) {
							System.out.println("What is your radius?");
							Scanner in4 = new Scanner(System.in);
							double r2 = in4.nextDouble();
							HashMap<String, Double> values_orbitTime = new HashMap<String, Double>();
							values_orbitTime.put("Radius ", r2);
							System.out.println(values_orbitTime);
						}
				}
//chemistry
		} else if (science_name.equals("chemistry")) {
			System.out.println("Which chemistry field?");
			System.out.println("1) stoichiometry");
			System.out.println("2) Balancing equations");
			Scanner in2 = new Scanner(System.in);
			chemistry_field = in.nextLine();
				if (chemistry_field.equals("1")){
	//stoichiometry
					System.out.println("Is this a limiting reaction (1) or excess (2)?");
					Scanner in7 = new Scanner(System.in);
					String chemistry_field_stoichiometry = in7.nextLine();

					if (chemistry_field_stoichiometry.equals("1")) {
								System.out.println("Enter your components of your equation");
								Scanner in9 = new Scanner(System.in);
								Scanner in_name = new Scanner(System.in);
									System.out.printf("First balance");	
										int balance_1 = in9.nextInt();
									System.out.printf("first reactant name");	
										String reactant_1 = in_name.nextLine();
									System.out.printf("Second balance");	
										int balance_2 = in.nextInt();
									System.out.printf("Second reactant name");	
										String reactant_2 = in_name.nextLine();
									System.out.printf("First balance product");	
										int balance_product_1 = in9.nextInt();
									System.out.printf("Product name");	
										String product_1 = in_name.nextLine();
									System.out.printf("Second balance, if there isn't one, put 0");
										int balance_product_2 = in9.nextInt();
									System.out.printf("Second product name, if there isn't one put no");	
										String product_2 = in_name.nextLine();
							
							if (balance_product_2 == 0 || product_2.equals("no")) {
								balance_product_2 = 0;
								product_2 = " ";
								System.out.printf(balance_1 + reactant_1 + " + " + balance_2 + reactant_2  + " ---> " + balance_product_1 + product_1 + " + " + balance_product_2 + product_2);		
							} else {
								System.out.printf(balance_1 + reactant_1 + " + " + balance_2 + reactant_2  + " ---> " + balance_product_1 + product_1 + " + " + balance_product_2 + product_2);
							} 
			//limiting reactions
						HashMap<Double, String> limiting_stoichiometry = new HashMap<Double, String>();
						
						System.out.printf("What is the limiting reactant?");
						Scanner in8 = new Scanner(System.in);
						String limiting_reactant_name = in8.nextLine();
						

						System.out.printf("And how much of this do you have? (answer in moles)");
						double limiting_reactant_amount = in8.nextInt();

						limiting_stoichiometry.put(limiting_reactant_amount, limiting_reactant_name);
						System.out.println(limiting_stoichiometry);
					} else if (chemistry_field_stoichiometry.equals("2")) {
			//excess reactions			
						System.out.println("this is for excess");
							System.out.println("Enter your components of your equation");
							Scanner in9 = new Scanner(System.in);
							Scanner in_name = new Scanner(System.in);
								System.out.printf("First balance");	
									int balance_1 = in9.nextInt();
								System.out.println("first reactant name");	
									String reactant_1 = in_name.nextLine();
								System.out.printf("Second balance");	
									int balance_2 = in9.nextInt();
								System.out.printf("Second reactant name");	
									String reactant_2 = in_name.nextLine();
								System.out.printf("First balance product");	
									int balance_product_1 = in9.nextInt();
								System.out.printf("Product name");	
									String product_1 = in_name.nextLine();
								System.out.printf("Second balance, if there isn't one, put 0");
									int balance_product_2 = in9.nextInt();
								System.out.printf("Second product name, if there isn't one put no");	
									String product_2 = in_name.nextLine();
						
						if (balance_product_2 == 0 || product_2.equals("no")) {
							balance_product_2 = 0;
							product_2 = " ";
							System.out.println(balance_1 + reactant_1 + " + " + balance_2 + reactant_2  + " ---> " + balance_product_1 + product_1 + " + " + balance_product_2 + product_2);		
						} else {
							System.out.println(balance_1 + reactant_1 + " + " + balance_2 + reactant_2  + " ---> " + balance_product_1 + product_1 + " + " + balance_product_2 + product_2);
						} 
					}

				} else if (chemistry_field.equals("2")); {
	//balancing equations				
				}
		
		} else {
			System.out.println("Please enter a valid science field");
			
		}
	}
}