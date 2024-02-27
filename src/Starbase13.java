
// import the scanner utility
import java.util.Scanner;

import hangerbay.lifeform;
import hangerbay.spaceship;

public class Starbase13 {
    // Defining the class "App" as the main class

    // init the scanner
    static Scanner userInput = new Scanner(System.in);
    // ready the variables
    static boolean isAnonymous;// a flag for later use
    static String passengerName;// Passenger's Name
    static int boardingPassNo;// Passenger's boarding Pass number
    // Defining a public method named main (MANDATORY) throws Exception when it runs
    // into an error

    public static void main(String[] args) throws Exception {
        // Description Into
        System.out.println("Beep\n Beep!\n\n bop!\n\n");
        System.out.println("We are reaching the destination\n\n");

        System.out.println("You look out to see your destination\n\t SpaceX - Starbase13.\n");
        System.out.println("It is small but rapidly gaining in size as you get closer!\n");
        System.out.println("You see the shimmer of the shield and begin to feel\n");
        System.out.println("the ship being pulled to the docking hanger.");

        System.out.println("\nDing!\n");
        System.out.println("We have arrived, please make your way to the exit.\n");

        System.out.println("You are stopped at the exit by an AI:");
        // write to the terminal
        System.out.println(
                "Hello,\f Welcome to Starbase 13!\n\f\tyour journey awaits!\n\n*May I have your name or boarding pass?\n\n\f(Boarding Passes you currently possess: PassNo.45682)\ninput:");

        // define a while loop for handling the user input making it more interactive
        // and dynamic
        while (userInput.hasNext()) {
            // define an if stament to control the output of the dialogue.
            if (userInput.hasNextInt()) { // userInput.hasNextInt() returns a boolean/ true if the next input item is of
                                          // type int and false otherwise
                // so the if statment says: if the input has another item and that item is of
                // type int do this.

                boardingPassNo = userInput.nextInt();// assign the boarding pass number given by the user to the
                                                     // variable boardingPassNo
                if (boardingPassNo == 45682) {// if the boardingPassNo variable has the value of 45862 then do this
                    // write to the terminal
                    System.out.println(
                            "We have you in the system and respect your privacy! As requested we'll keep your information anonymous.\n");

                    passengerName = "****";// assign the next input item to the variable passengerName
                    isAnonymous = true;// set the anonymous flag
                    break;// end the loop
                } else {// otherwise do this
                    // write to the terminal
                    System.out.println("I don't see your boarding pass, may I have your name?\f");
                    passengerName = userInput.nextLine(); // assign the next input item to the variable passengerName
                    continue;// end the loop
                } // end if statement

            } else {
                passengerName = userInput.nextLine();
                break;
            } // end if statment

        } // end while loop block
        System.out.println("welcome " + passengerName + "\f");// write to terminal
        System.out.print("Thank you,");// write to terminal
        if (!isAnonymous) {// if not anonymous do this
            // write to terminal a personalized welcome
            System.out.print(" " + passengerName + ",");
        } else {
            // do nothing
        }
        ;
        // write to terminal

        System.out.print(" we hope you enjoy your time here on Starbase 13!\n\n.\t.\t.\n");
        userInput.close();// close the input stream
        System.out.println(
                "Once off the ship you see a few different lifeforms and ships scattered about the hangar. Your \n*** scannerLense *** \t immediately starts profiling:\n\n");
        lifeform Luminari = new lifeform();
        Luminari.setDescription(
                "Tall and slender, with bioluminescent patterns coursing beneath their translucent skin, the Luminari are a race of humanoid beings from a planet bathed in perpetual twilight. They possess telepathic abilities and are known for their deep connection to the natural world, often referred to as guardians of their planet's ecosystem.");
        Luminari.setAge(100);
        Luminari.setRace("luminari");
        Luminari.setName("Xula");
        Luminari.setShip(new spaceship(Luminari,
                "a sleek vessel designed to blend seamlessly with the ethereal beauty of space. It features translucent panels that allow the soft glow of the Luminari's bioluminescence to shine through, giving it an otherworldly appearance. Equipped with advanced organic technology, the Aurora Skimmer harnesses the power of starlight to propel itself through the cosmos, reflecting the harmonious relationship between the Luminari and their natural surroundings.",
                "Aurora Skimmer"));

        lifeform Trilixians = new lifeform();
        Trilixians.setDescription(
                "Trilixians are humanoid aliens characterized by their tri-faceted heads, each face representing a different aspect of their personality: intellect, emotion, and intuition. They have a highly advanced society built on the principles of harmony and balance, and their technological prowess rivals that of the most advanced civilizations in the galaxy.");
        Trilixians.setRace("Trilixian");
        Trilixians.setShip(new spaceship(Trilixians,
                " The Trilixians: The Trilixian spaceship, called the \"Triad Nexus,\" is a marvel of engineering and psychic integration. Its design mirrors the tri-faceted nature of the Trilixian consciousness, with three distinct sections representing intellect, emotion, and intuition. The Triad Nexus utilizes a sophisticated neural interface that allows Trilixian pilots to merge their minds with the ship's systems, achieving unparalleled levels of control and coordination.",
                "Triad Nexus"));
        Trilixians.setName("Hilfred");

        System.out.println(Trilixians.scan() + "\n\n" + Trilixians.getShip().scan());
        System.out.println(Luminari.scan() + "\n\n" + Luminari.getShip().scan());

        // Creating and describing Venturians and their spaceship
        lifeform venturians = new lifeform();
        venturians.setDescription(
                "Hailing from a desert planet with harsh living conditions, the Venturians have evolved a resilient physiology, with tough, sand-colored skin and reflective eyes adapted to intense sunlight. They are skilled traders and explorers, known for their resourcefulness and adaptability in the face of adversity.");
        venturians.setRace("Venturian");
        venturians.setShip(new spaceship(venturians,
                "The Venturians: Venturian spaceships, known as \"Sandstriders,\" are rugged and utilitarian vessels built to withstand the harsh conditions of deep space and hostile environments. Resembling massive sand dunes with sleek, angular forms, Sandstriders are equipped with advanced environmental systems and modular compartments that can be customized to suit the needs of their diverse crew. Despite their imposing appearance, Venturian ships are surprisingly agile and nimble, capable of navigating through asteroid fields and treacherous terrain with ease.",
                "Sandstrider"));
        venturians.setName("Rorax");

        System.out.println(venturians.scan() + "\n\n" + venturians.getShip().scan() + "\n\n");

        // Creating and describing Aquarians and their spaceship
        lifeform aquarians = new lifeform();
        aquarians.setDescription(
                "Aquarians are a humanoid species adapted to life in the depths of oceanic worlds. With glistening, iridescent skin and webbed digits, they possess enhanced swimming abilities and are attuned to the subtle currents of their aquatic environment. Their society is built around communal living and a deep reverence for the ocean.");
        aquarians.setRace("Aquarian");
        aquarians.setShip(new spaceship(aquarians,
                "The Aquarians: Aquarian spaceships, named \"Coral Runners,\" are elegant and graceful vessels inspired by the organic forms of marine life. Crafted from resilient materials that mimic the strength and flexibility of coral reefs, Coral Runners are equipped with hydrodynamic propulsion systems that allow them to glide effortlessly through the depths of space. Their interiors are adorned with intricate carvings and colorful plumage, creating a tranquil and serene atmosphere reminiscent of the ocean depths.",
                "Coral Runner"));
        aquarians.setName("Nerissa");

        System.out.println(aquarians.scan() + "\n\n" + aquarians.getShip().scan() + "\n\n");

        // Creating and describing Avians and their spaceship
        lifeform avians = new lifeform();
        avians.setDescription(
                "Resembling humanoid birds with sleek feathers and elongated beaks, the Avians are a highly intelligent species with a strong sense of community and hierarchy. They possess powerful wings that allow them to soar through the skies of their homeworld, which is dotted with floating cities and intricate aerial habitats.");
        avians.setRace("Avian");
        avians.setShip(new spaceship(avians,
                "The Avians: Avian spaceships, known as \"Skyrifters,\" are majestic vessels designed to soar through the skies of their homeworld and beyond. Resembling giant birds of prey with sweeping wings and streamlined bodies, Skyrifters harness the power of anti-gravity technology to achieve flight without the need for conventional propulsion systems. Their interiors are adorned with intricate carvings and colorful plumage, reflecting the artistic sensibilities of the Avian species.",
                "Skyrifter"));
        avians.setName("Aerion");

        System.out.println(avians.scan() + "\n\n" + avians.getShip().scan() + "\n\n");

    }// end public method main
}// end public class App

// The Luminari: Tall and slender, with bioluminescent patterns coursing beneath
// their translucent skin, the Luminari are a race of humanoid beings from a

// planet bathed in perpetual twilight. They possess telepathic abilities andd
// are known for their deep connection to the natural world, often referred to
// as guardians of their planet's ecosystem.

// The Trilixians: Trilixians are humanoid aliens characterized by their
// tri-faceted heads, each face representing a different aspect of their
// personality: intellect, emotion, and intuition. They have a highly advanced
// society built on the principles of harmony and balance, and their
// technological prowess rivals that of the most advanced civilizations in the
// galaxy.

// The Venturians: Hailing from a desert planet with harsh living conditions,
// the Venturians have evolved a resilient physiology, with tough, sand-colored
// skin and reflective eyes adapted to intense sunlight. They are skilled
// traders and explorers, known for their resourcefulness and adaptability in
// the face of adversity.

// The Aquarians: Aquarians are a humanoid species adapted to life in the depths
// of oceanic worlds. With glistening, iridescent skin and webbed digits, they
// possess enhanced swimming abilities and are attuned to the subtle currents of
// their aquatic environment. Their society is built around communal living and
// a deep reverence for the ocean.

// The Avians: Resembling humanoid birds with sleek feathers and elongated
// beaks, the Avians are a highly intelligent species with a strong sense of
// community and hierarchy. They possess powerful wings that allow them to soar
// through the skies of their homeworld, which is dotted with floating cities
// and intricate aerial habitats.

// The Luminari: Their spaceship, known as the "Aurora Skimmer," is a sleek
// vessel designed to blend seamlessly with the ethereal beauty of space. It
// features translucent panels that allow the soft glow of the Luminari's
// bioluminescence to shine through, giving it an otherworldly appearance.
// Equipped with advanced organic technology, the Aurora Skimmer harnesses the
// power of starlight to propel itself through the cosmos, reflecting the
// harmonious relationship between the Luminari and their natural surroundings.

// The Trilixians: The Trilixian spaceship, called the "Triad Nexus," is a
// marvel of engineering and psychic integration. Its design mirrors the
// tri-faceted nature of the Trilixian consciousness, with three distinct
// sections representing intellect, emotion, and intuition. The Triad Nexus
// utilizes a sophisticated neural interface that allows Trilixian pilots to
// merge their minds with the ship's systems, achieving unparalleled levels of
// control and coordination.

// The Venturians: Venturian spaceships, known as "Sandstriders," are rugged and
// utilitarian vessels built to withstand the harsh conditions of deep space and
// hostile environments. Resembling massive sand dunes with sleek, angular
// forms, Sandstriders are equipped with advanced environmental systems and
// modular compartments that can be customized to suit the needs of their
// diverse crew. Despite their imposing appearance, Venturian ships are
// surprisingly agile and nimble, capable of navigating through asteroid fields
// and treacherous terrain with ease.

// The Aquarians: Aquarian spaceships, named "Coral Runners," are elegant and
// graceful vessels inspired by the organic forms of marine life. Crafted from
// resilient materials that mimic the strength and flexibility of coral reefs,
// Coral Runners are equipped with hydrodynamic propulsion systems that allow
// them to glide effortlessly through the depths of space. Their interiors are
// filled with bioluminescent displays and flowing curves, creating a tranquil
// and serene atmosphere reminiscent of the ocean depths.

// The Avians: Avian spaceships, known as "Skyrifters," are majestic vessels
// designed to soar through the skies of their homeworld and beyond. Resembling
// giant birds of prey with sweeping wings and streamlined bodies, Skyrifters
// harness the power of anti-gravity technology to achieve flight without the
// need for conventional propulsion systems. Their interiors are adorned with
// intricate carvings and colorful plumage, reflecting the artistic
// sensibilities of the Avian species.