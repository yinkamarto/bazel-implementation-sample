import numpy
import scipy


def analyze_data(x: numpy.ndarray, y: numpy.ndarray):
    regression = scipy.stats.linregress(x, y)
    
    return {
        "slope": regression.slope,
        "intercept": regression.intercept,
        "r_squared": regression.rvalue ** 2,
    }


if __name__ == "__main__":
    x = numpy.array([1, 2, 3, 4, 5])
    y = numpy.array([1, 2, 3, 4, 5])
    
    print(analyze_data(x, y))
    