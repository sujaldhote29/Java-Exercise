import turtle

def draw_rectangle(color, width, height):
    turtle.begin_fill()
    turtle.fillcolor(color)
    for _ in range(2):
        turtle.forward(width)
        turtle.right(90)
        turtle.forward(height)
        turtle.right(90)
    turtle.end_fill()

def draw_square(color, size):
    turtle.begin_fill()
    turtle.fillcolor(color)
    for _ in range(4):
        turtle.forward(size)
        turtle.right(90)
    turtle.end_fill()

def draw_indian_flag_quick():
    turtle.speed(5)

    # Draw the green rectangle
    draw_rectangle("#138808", 900, 600)

    # Draw the white rectangle
    turtle.penup()
    turtle.goto(-450, 300)
    turtle.pendown()
    draw_rectangle("white", 900, 200)

    # Draw the orange rectangle
    turtle.penup()
    turtle.goto(-450, 100)
    turtle.pendown()
    draw_rectangle("#FF9933", 900, 200)

    # Draw the navy blue Ashoka Chakra (24-spoke wheel)
    turtle.penup()
    turtle.goto(-50, 70)
    turtle.pendown()
    draw_square("#000080", 100)
    turtle.penup()
    turtle.goto(-50, 20)
    turtle.pendown()
    turtle.circle(50)

    turtle.hideturtle()
    turtle.done()

# Run the function to draw the simplified Indian flag quickly
draw_indian_flag_quick()
