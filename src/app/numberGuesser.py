import random

# import sys
# import os

# SCRIPT_DIR = os.path.dirname(os.path.realpath(__file__))
# sys.path.append(os.path.dirname(SCRIPT_DIR))

from src.app.lib.lib import get_int_input

class NumberGuesser():
    def run_game(self) -> None:
        print("Welcome to the Number Guessing Game.\nYou have 7 tries. Let's begin!")

        low = get_int_input("What is your Lower Bound: ")
        high = get_int_input("What is your Upper Bound: ")

        print(f"\nYou have 7 chances to guess the number between {low} and {high}. Let's begin!")

        num = random.randint(low, high)
        chances_left = 7
        guessCounter = 0

        while guessCounter < chances_left:
            guessCounter += 1
            guess = get_int_input("Enter your guess: ")

            if guess == num:
                print(f"Correct! The number is {num}. You guessed it in {guessCounter} attempts.")
                break

            elif guessCounter >= chances_left and guess != num:
                print(f"Sorry! The number was {num}. Better luck next time.")

            elif guess > num:
                print("Too high! Try a lower number.")

            elif guess < num:
                print("Too low! Try a higher number.")


if __name__ == "__main__":
    NumberGuesser().run_game()
