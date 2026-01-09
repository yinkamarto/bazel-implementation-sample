def get_int_input(text: str = "") -> int:
    while True:
        try:
            value = int(input(text))
            return value
        except ValueError:
            print("Error: Invalid input. Please enter a whole number.")
