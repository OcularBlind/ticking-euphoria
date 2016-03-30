//IDEAS NOT YET IPLIMENTED
// TOWNS SHOPS AND INNS AND THE LIKE
// HOUSE STORAGE MAYBE TROPHIES FROM ADVENTURES
// END OF GAME??????????
// DIE OF OLD AGE?
// death at 40 years
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class TickingEuphoria {
	public static void main(String[] args) {
		int direction=0;
		int decision=0;
		int menu=0;
		int useditem=0;
		String name="";
		int currentlocation=0;
		String currentlocationstring="";
		int randomevent=0;
		int rations=0;
		int potions=0;
		int wealth=0;
		int condition=0;
		int health=0;
		int maxhp=0;
		int location1=0;
		String location1string="";
		int location2=0;
		String location2string="";
		int location3=0;
		String location3string="";
		int location4=0;
		String location4string="";
		String wealthstring="";
		int cost1=0;
		int cost2=0;
		int cost3=0;
		int cost4=0;
		boolean hasgift=false;
		boolean alive=true;
		boolean desertbotany=false;
		boolean happydruid=false;
		boolean exploredcurrent=false;
		boolean decided=false;
		boolean select0fordirection=false;
		boolean returning=false;
		boolean honey=false;

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please submit your name: ");
		name=(sc.nextLine()).trim();
		
		System.out.println("Welcome to TheGame!");
		
		try{TimeUnit.MILLISECONDS.sleep(600);}
		catch(InterruptedException ex){Thread.currentThread().interrupt();}
		
		System.out.println("If your health or rations fall below zero, you die.");
		
		try{TimeUnit.MILLISECONDS.sleep(1500);}
		catch(InterruptedException ex){Thread.currentThread().interrupt();}
		
		//These are the player's base stats and items.
		health=20;
		maxhp=20;
		condition=2;
		rations=5;
		potions=2;
		currentlocation=9001;
		desertbotany=false;
		happydruid=false;
		
		while(!hasgift){
			
			System.out.println("Everyone is born with a gift, what is your gift, " + name + "?");
			System.out.println("(0) You are completely average. You have no gift.");
			System.out.println("(1) You are particularly sturdy.");
			System.out.println("(2) Your parents were rather wealthy. You've inhereted that wealth.");
			System.out.println("(3) Your family ran an underground potion brewery.");
			System.out.println("(4) You used to run a soup kitchen. It was shut down, leaving you with an abundance of food.");
			System.out.println("(5) You hail from the deserts and have a history of studying plant life.");
			System.out.println("(6) You are kindred to nature.");
			System.out.print("Choose your gift: ");
			decision=sc.nextInt();
			
			switch(decision){
				case(0):
					hasgift=true;
				break;
				case(1):
					maxhp=30;
					health=30;
					hasgift=true;
				break;
				case(2):
					wealth=50;
					hasgift=true;
				break;
				case(3):
					potions=10;
					hasgift=true;
				break;
				case(4):
					rations=25;
					hasgift=true;
				break;
				case(5):
					desertbotany=true;
					hasgift=true;
				break;
				case(6):
					happydruid=true;
					hasgift=true;
				break;
				default:
					System.out.println("That's not a valid gift.");
				break;
			}
		}
		while(alive){
		switch(currentlocation){
			case(0):
				currentlocationstring="village";
			break;
			case(1):
				currentlocationstring="plains";
			break;
			case(2):
				currentlocationstring="plains";
			break;
			case(3):
				currentlocationstring="mountain range";
			break;
			case(4):
				currentlocationstring="mountain range";
			break;
			case(5):
				currentlocationstring="desert";
			break;
			case(6):
				currentlocationstring="desert";
			break;
			case(7):
				currentlocationstring="wetland";
			break;
			case(8):
				currentlocationstring="wetland";
			break;
			case(69):
				currentlocationstring="Your camp";
			break;
			case(9001):
				currentlocationstring="Your Home";
			break;
			default:
				currentlocationstring="You're not sure how, but you've landed in a land between lands. A place that does not exist.";
			break;
		}
		
		System.out.println("You have " + health + " health.");
		System.out.println("What would you like to do?");
		System.out.println("(1) Inventory");
		System.out.println("(2) Travel");
		if(exploredcurrent)
			System.out.println("(/) You've already explored this area.");
		else
			System.out.println("(3) Explore current area (" + currentlocationstring + ")");
		System.out.println("(4) Teleport home"); 
		System.out.print("Enter selection: ");
		menu=sc.nextInt();
		
		switch(menu){
			case(1):
				System.out.println("(0) Nothing.");
				System.out.println("(1) You have " + rations + " rations.");
				System.out.println("(2) You have " + potions + " potions.");
				System.out.println("(3) You have " + wealth + " wealth.");
				System.out.print("Use which item?: ");
				useditem=sc.nextInt();
				switch(useditem){
					case(0):
						System.out.println("You close your inventory.");
						returning=true;
					break;
					case(1):
						System.out.println("You set up camp, restoring 5 health and removing any negative status effects for 1 ration");
						rations--;
						health=health+5;
						condition=2;
						currentlocation=69;
						returning=true;
					break;
					case(2):
						System.out.print("You use a potion ");
						potions--;
						health=health+10;
						if(currentlocation==69){
							health=health+(maxhp-health);
							System.out.println("and recover " + (maxhp-health) + " health");
						}else System.out.println("and recover 10 health");
						returning=true;
					break;
					case(3):
						System.out.println("Work in Progress. Sorry.");
						returning=true;
					break;
				}
			break;
			case(2):
				if(!select0fordirection){
				location1=(int)(Math.random()*9);
				location2=(int)(Math.random()*9);
				location3=(int)(Math.random()*9);
				location4=(int)(Math.random()*9);
				}
				
				switch(location1){
				case(0):
					location1string="village";
					cost1=1;
				break;
				case(1):
					location1string="plains";
					cost1=2;
				break;
				case(2):
					location1string="plains";
					cost1=2;
				break;
				case(3):
					location1string="mountain range";
					cost1=3;
				break;
				case(4):
					location1string="mountain range";
					cost1=3;
				break;
				case(5):
					location1string="desert";
					cost1=3;
				break;
				case(6):
					location1string="desert";
					cost1=3;
				break;
				case(7):
					location1string="wetland";
					cost1=2;
				break;
				case(8):
					location1string="wetland";
					cost1=2;
				break;
				}
				switch(location2){
				case(0):
					location2string="village";
					cost2=1;
				break;
				case(1):
					location2string="plains";
					cost2=2;
				break;
				case(2):
					location2string="plains";
					cost2=2;
				break;
				case(3):
					location2string="mountain range";
					cost2=3;
				break;
				case(4):
					location2string="mountain range";
					cost2=3;
				break;
				case(5):
					location2string="desert";
					cost2=3;
				break;
				case(6):
					location2string="desert";
					cost2=3;
				break;
				case(7):
					location2string="wetland";
					cost2=2;
				break;
				case(8):
					location2string="wetland";
					cost2=2;
				break;
				}
				switch(location3){
				case(0):
					location3string="village";
					cost3=1;
				break;
				case(1):
					location3string="plains";
					cost3=2;
				break;
				case(2):
					location3string="plains";
					cost3=2;
				break;
				case(3):
					location3string="mountain range";
					cost3=3;
				break;
				case(4):
					location3string="mountain range";
					cost3=3;
				break;
				case(5):
					location3string="desert";
					cost3=3;
				break;
				case(6):
					location3string="desert";
					cost3=3;
				break;
				case(7):
					location3string="wetland";
					cost3=2;
				break;
				case(8):
					location3string="wetland";
					cost3=2;
				break;
				}
				switch(location4){
				case(0):
					location4string="village";
					cost4=1;
				break;
				case(1):
					location4string="plains";
					cost4=2;
				break;
				case(2):
					location4string="plains";
					cost4=2;
				break;
				case(3):
					location4string="mountain range";
					cost4=3;
				break;
				case(4):
					location4string="mountain range";
					cost4=3;
				break;
				case(5):
					location4string="desert";
					cost4=3;
				break;
				case(6):
					location4string="desert";
					cost4=3;
				break;
				case(7):
					location4string="wetland";
					cost4=2;
				break;
				case(8):
					location4string="wetland";
					cost4=2;
				break;
				}
				System.out.println("Which direction would you like to go?");
				System.out.println("(0) None");
				System.out.println("(1) Forward to a " + location1string + " for a cost of " + cost1 + " rations.");
				System.out.println("(2) Right to a " + location2string + " for a cost of " + cost2 + " rations.");
				System.out.println("(3) Left to a " + location3string + " for a cost of " + cost3 + " rations.");
				System.out.println("(4) Back to a " + location4string + " for a cost of " + cost4 + " rations.");
				System.out.print("Enter selection: ");
				direction=sc.nextInt();
				
				switch(direction){
					case(0):
						System.out.println("Returning to previous menu...");
						returning=true;
						select0fordirection=true;
					break;
					case(1):
						System.out.println("You go forward toward the " + location1string);
						rations=rations-cost1;
						currentlocation=location1;
						select0fordirection=false;
						exploredcurrent=false;
						decided=false;
					break;
					case(2):
						System.out.println("You go right toward the " + location2string);
						rations=rations-cost2;
						currentlocation=location2;
						select0fordirection=false;
						exploredcurrent=false;
						decided=false;
					break;
					case(3):
						System.out.println("You go left toward the " + location3string);
						rations=rations-cost3;
						currentlocation=location3;
						select0fordirection=false;
						exploredcurrent=false;
						decided=false;
					 break;
					case(4):
						System.out.println("You go back to the " + location4string);
						rations=rations-cost4;
						currentlocation=location4;
						select0fordirection=false;
						exploredcurrent=false;
						decided=false;
					break;
					default:
						System.out.println("That is not a valid direction. Returning to the previous menu...");
						returning=true;
						select0fordirection=true;
					break;
			}
			break;
			case(3):
				if(exploredcurrent)
					System.out.println("You've already explored this area.");
				else{
					switch(currentlocation){
						case(0):
						//village
						break;
						case(1):
						//plains1
							randomevent=(int)(Math.random()*5);
							switch(randomevent){
							case(0):
								while(!decided){
									System.out.println("You find a cave amongst the hills. Do you explore it?");
									System.out.println("(1) Yes.");
									System.out.println("(2) No.");
									decision=sc.nextInt();
									switch(decision){
										case(1):
											randomevent=(int)(Math.random()*3);
											switch(randomevent){
												case(0):
													System.out.println("You are attacked by a lion for 5 health.");
													health=health-5;
												break;
												case(1):
													if(wealth<5)
														wealthstring=Integer.toString(wealth);
													else
														wealthstring="5";
														System.out.println("You are attacked by a thief. He steals " + wealthstring + " wealth from you and leaves you unscathed.");
														wealth=wealth-5;
												break;
												case(2):
													System.out.println("The cave is abandoned. You find 10 wealth left by the previous inhabitants.");
													wealth=wealth+10;
												break;
											}
											decided=true;
										break;
										case(2):
											System.out.println("You don't explore the cave. You instead kick back and enjoy the gentle sun of the plains. You restore 2 health.");
											health=health+2;
											decided=true;
										break;
										default:
											System.out.println("That is not a valid choice");
											decided=false;
										break;
									}
								}
							break;
							case(1):
							case(2):
							case(3):
							case(4):
								System.out.println("You forage some berries, roots, and nuts. You gain 3 rations.");
								rations=rations+3;
							break;
							}
							exploredcurrent=true;
						break;
						case(2):
						//plains2
							randomevent=(int)(Math.random()*5);
							switch(randomevent){
								case(0):
									while(!decided){
										System.out.println("You find a secluded waterfall spring. What do you do?");
										System.out.println("(1) Press against the waterfall.");
										System.out.println("(2) Rest and gather supplies.");
										decision=sc.nextInt();
										switch(decision){
											case(1):
												randomevent=(int)(Math.random()*3);
												switch(randomevent){
													case(0):
														System.out.println("You press against the waterfall, revealing a hidden cave! The cave is brimming with valuable gemstones and edible fungus! You gather 10 wealth and 5 rations.");
														wealth=wealth+10;
														rations=rations+5;
													break;
													case(1):
													case(2):
														System.out.println("You press against the waterfall. You Don't find anything but wet rocks. You take some time to gather 2 rations worth of supplies.");
														rations=rations+2;
													break;
												}
												decided=true;
											break;
											case(2):
												System.out.println("You take your time to refresh and gather. You recover 5 health and obtain 4 rations.");
												health=health+5;
												rations=rations+4;
												decided=true;
											break;
											default:
												decided=false;
											break;
										}
									}
								break;
								case(1):
								case(2):
								case(3):
								case(4):
									System.out.println("You forage some berries, roots, and nuts. You gain 3 rations.");
									rations=rations+3;
								break;
							}
							exploredcurrent=true;
						break;
						case(3):
						//mountain range1
							randomevent=(int)(Math.random()*0);
							switch(randomevent){
								case(0):
									while(!decided){
										System.out.println("You stumble upon a large stone gate. With your approach it glows violently. The gate cracks and makes a thunderous noise. It slides down into the floor, revealing a black portal into the face of the mountain.");
										System.out.println("(1) Charge in. Face the abyss head on.");
										System.out.println("(2) Assess. Tread carefully, taking note of your surroundings as you explore the cave.");
										System.out.println("(3) Wait. Set up camp just outside the gate.");
										System.out.print("What do you do?: ");
										decision=sc.nextInt();
										switch(decision){
											case(1):
												while(!decided){
													System.out.println("You sprint at the speed of a cheeta. Pitfalls, dart traps, and spike traps trigger just as you pass over them. You feel like a badass.");
													System.out.println("Before you lies a ceremonial hall. Lots of short robed figures stand before you worshiping a rather stout looking statue.");
													System.out.println("The figures turn to face you. You react.");
													System.out.println("(1) Start beating them up.");
													System.out.println("(2) Try to communicate.");
													decision=sc.nextInt();
													switch(decision){
														case(1):
															
														break;
														case(2):
															System.out.println("\"Hello\" You say, while waving to the group of thirty to fourty dwarves. They throw back their hoods. An aged face approaces you.");
															System.out.println("\"We have long waited for a being such as yourself. Entrance to our sanctum would only be granted to one with exceptional courage and vigor.\"");
														break;
														default:
															System.out.println("That's not a valid action.");
															decided=false;
														break;
													}
												}
											break;
											case(2):
												
											break;
											case(3):
												
											break;
											default:
												System.out.println("That's not a valid action.");
												decided=false;
											break;
										}
									}
								break;
								case(1):
								case(2):
								case(3):
								case(4):
								case(5):
								case(6):
								case(7):
								case(8):
								case(9):
									System.out.println("You hike through the range. You find a nice peak to take a break on. You reflect and admire the landscape. You restore 2 health.");
									health=health+2;
								break;
							}
							exploredcurrent=true;
						break;
						case(4):
						//mountain range2
							randomevent=(int)(Math.random()*5);
							switch(randomevent){
								case(0):
									while(!decided){
										System.out.println("You spot a cave and enter it. You find yourself inside an underground grove. What do you do?");
										System.out.println("(1) Harvest all of the rations.");
										System.out.println("(2) Harvest a few rations.");
										System.out.println("(3) Set up a picnic.");
										System.out.print("What do you do?: ");
										decision=sc.nextInt();
										switch(decision){
											case(1):
												System.out.println("You harvest as many rations as you can. You gather 10 rations. Before you can leave, a druid attacks you. She's not happy. You take 5 health damage.");
												rations=rations+10;
												health=health-5;
												happydruid=false;
											break;
											case(2):
												System.out.println("You gather some rations, careful not to upset the balance of the grove. You gather 5 rations.");
												rations=rations+5;
											break;
											case(3):
												System.out.println("You set up a rather lavish picnic at the price of 2 rations. You restore 10 health. On your way out you are met by a druid and she thanks you for not defiling her lands. The druid presents you with some healthy fruit. You gain 3 rations.");
												rations=rations+1;
												happydruid=true;
											break;
										}
									}
								break;
								case(1):
								case(2):
								case(3):
								case(4):
									System.out.println("You hike through the range. You pass the occational fruit bearing tree and gather fruit. You gain 2 rations.");
									rations=rations+2;
								break;
							}
							exploredcurrent=true;
						break;
						case(5):
						//desert1
							randomevent=(int)(Math.random()*10);
							switch(randomevent){
								case(0):
									while(!decided){
										System.out.println("A large structure comes in to view. The structure is composed of mainly sandstone and gold. (WIP)");
									}
								break;
								case(1):
								case(2):
								case(3):
								case(4):
								case(5):
								case(6):
								case(7):
								case(8):
								case(9):
									if(!desertbotany)
										System.out.println("You find nothing while sifting through the empty dunes.");
									else{
										System.out.println("You spend time digging up healthy roots and finding small water reserves. You gain 4 rations.");
										rations=rations+4;}
								break;
							}
							exploredcurrent=true;
						break;
						case(6):
						//desert2
							randomevent=(int)(Math.random()*6);
							switch(randomevent){
								case(0):
									while(!decided){
										System.out.println("Over the horizon you spot an oasis! But there's also an alluring field of cacti to your left. What do you do?");
										System.out.println("(1) Investigate the oasis");
										System.out.println("(2) Explore the field of cacti");
										decision=sc.nextInt();
										switch(decision){
											case(1):
												if(!desertbotany){
													randomevent=(int)(Math.random()*3);
													switch(randomevent){
														case(0):
															System.out.println("You investigate the oasis to find that it's bountiful and full of life! A botanist is residing here. You help with her research. She shares her knowledge of derert related botany and 5 rations for helping with her research.");
															desertbotany=true;
															rations=rations+5;
															decided=true;
														break;
														case(1):
														case(2):
															System.out.println("As you get close to the oasis, it vanishes. You feel disappointed.");
															decided=true;
														break;
													}
												} else{
													System.out.println("As you approach the oasis you spot your friend the botanist. \"Hello " + name + "!\" She greets you cheerfuly and offers company. She shares 5 rations of food.");
													decided=true;
												}
											break;
											case(2):
												randomevent=(int)(Math.random()*2);
												switch(randomevent){
													case(0):
														System.out.println("You find that the cacti are full of life! You scavenge 4 rations worth of cactus juice.");
														rations=rations+4;
													break;
													case(1):
														if(!desertbotany){
															System.out.println("You approach the cacti. Inside the cacti are a colony of huge bugs! You get stung and bitten for 3 health. They use your blood for nourishment. You lose a total of 5 health. You wake up covered in honey. It rejuvenates you. You gain 3 rations.");
														} else{
															while(!decided){
																System.out.println("You know better than to approach a thirsty hive of veesitos. You throw a ration of water into the cacti. The hive buzzes to life and thanks you, rewarding you with rich pure honey. Do you store it, or convert it to wealth or rations?");
																System.out.println("(1) store");
																System.out.println("(2) wealth");
																System.out.println("(3) rations");
																System.out.print("What do you do?: ");
																decision=sc.nextInt();
																switch(decision){
																	case(1):
																		System.out.println("You jar the honey and save it for future use.");
																		honey=true;
																		rations=rations-1;
																		decided=true;
																	break;
																	case(2):
																		System.out.println("You gain 5 wealth.");
																		wealth=wealth+5;
																		rations=rations-1;
																		decided=true;
																	break;
																	case(3):
																		System.out.println("You gain 10 rations.");
																		rations=rations+9;
																		decided=true;
																	break;
																}
															}
														}	
													break;
												}
										break;
									}
								}
								break;
								case(1):
								case(2):
								case(3):
								case(4):
								case(5):
									if(!desertbotany)
										System.out.println("You find nothing while sifting through the empty dunes.");
									else{
										System.out.println("You spend time digging up healthy roots and finding small water reserves. You gain 4 rations.");
										rations=rations+4;}
								break;
							}
							exploredcurrent=true;
						break;
						case(7):
							//final area
							exploredcurrent=true;
						break;
						case(8):
							//final area
							exploredcurrent=true;
						break;
						case(69):
						//player camp
							System.out.println("Why are you trying to explore your own camp? Stop.");
							exploredcurrent=true;
						break;
						case(9001):
						//player home
							System.out.println("You are at your home. (Something's planned to be here, eventually.)");
						break;
					}
				}
			break;
			case(4):
				if(currentlocation==9001)
					System.out.println("You are already home!");
				else{
				System.out.println("You feel familiar winds whip around you violently.");
				try{TimeUnit.MILLISECONDS.sleep(2000);}
				catch(InterruptedException ex){Thread.currentThread().interrupt();}
				System.out.println("Everything gets brighter and brighter until you can no longer see.");
				try{TimeUnit.MILLISECONDS.sleep(2000);}
				catch(InterruptedException ex){Thread.currentThread().interrupt();}
				System.out.println("When your vision recovers, you find yourself at home.");
				currentlocation=9001;
				returning=true;
				}
			break;
			default:
				System.out.println("That is not a valid input.");
			break;
		}
		if(health>maxhp)
			health=maxhp;
		if(wealth<0)
			wealth=0;
		
		if(!returning){
		switch(condition){
			case(0):
				health--;
			case(1):
				rations--;
			case(2):
			break;
		}
		}
				System.out.println("You have " + rations + " rations.");
				System.out.println("You have " + wealth + " wealth.");
		
		returning=false;
		if(health<0)
			alive=false;
		if(rations<0)
			alive=false;
		}
		System.out.println("Game over.");
		sc.close();
	}	
}	
