import unittest

from src.app.numberGuesser import NumberGuesser

class NumberGuesserTest(unittest.TestCase):
    # def test_get_int_input_with_non_numeric(mocker, capsys):
    #     with mocker.patch("builtins.input", return_value="a"):   
    #         captured = capsys.readouterr()
    #         NumberGuesser().get_int_input()
    #         assert captured.out == "Hello, World!\n"
            
    def test_nothing(self):
        assert "a" is "a"

if __name__ == '__main__':
    unittest.main()