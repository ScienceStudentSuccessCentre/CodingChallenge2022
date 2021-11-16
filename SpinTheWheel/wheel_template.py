# display functions
def display_wheel():

    horizontal_line()

    for i in range(15):
        if i == 3:
            top_description(i)
        elif i == 13:
            top_middle_description(i)
        else:
            upper_vertical_lines(i)

    horizontal_line()

    for i in range(15):
        if i == 3:
            bottom_middle_description(i)
        elif i == 13:
            bottom_description(i)
        else:
            lower_vertical_lines(i)

    horizontal_line()


def horizontal_line():
    print("-" * 35)


def top_description(num):
    print("|", end="")
    print(" " * num, end="")
    print("\\", end="")
    print("   $1000    |   -1 turn  ", end="")
    print("/", end="")
    print(" " * num, end="")
    print("|", end="\n")


def top_middle_description(num):
    print("|", end="")
    print("   $1000     ", end="")
    print("\\ ", end="")
    print(" | ", end="")
    print(" /", end="")
    print("     $1000   ", end="")
    print("|", end="\n")


def upper_vertical_lines(num):
    print("|", end="")
    print(" " * num, end="")
    print("\\", end="")
    print(" " * (15-num), end="")
    print("|", end="")
    print(" " * (15-num), end="")
    print("/", end="")
    print(" " * num, end="")
    print("|", end="\n")


def bottom_middle_description(num):
    print("|", end="")
    print("   $1000    ", end="")
    print("/  ", end="")
    print(" | ", end="")
    print("  \\", end="")
    print("   -1 turn  ", end="")
    print("|", end="\n")


def bottom_description(num):
    print("|", end="")
    print(" " * (15-num), end="")
    print("/", end="")
    print("   -1 turn   |    $1000    ", end="")
    print("\\", end="")
    print(" " * (15-num), end="")
    print("|", end="\n")


def lower_vertical_lines(num):
    print("|", end="")
    print(" " * (15-num), end="")
    print("/", end="")
    print(" " * num, end="")
    print("|", end="")
    print(" " * num, end="")
    print("\\", end="")
    print(" " * (15-num), end="")
    print("|", end="\n")

display_wheel()