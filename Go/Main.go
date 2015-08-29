package main
import (
	"fmt"
)

func main() {
	pyramid := Pyramid{0}
	for !pyramid.isValidPyramid() {
		i := 0
		fmt.Print("Height: ")
		fmt.Scan(&i)
		pyramid = Pyramid{i}
	}
	fmt.Print(pyramid.toString())
}


type Pyramid struct {
	height int
}

func (p Pyramid) toString() string {
	halfPyramidToPrint := string("")
	for layerIndex := 0; layerIndex < p.height; layerIndex++ {
		//This calculates the amount of hashes to have in the current printing layer.
		//Since the initial layer will have 2 hashes we take the layer index and add two to it.
		hashCount := layerIndex + 2
		//To create the half pyramid form we need to have the correct number of spaces to justify the hashes correctly
		//This is the height and you subtract the hash count minus 1
		spaceCount := p.height - (hashCount - 1)

		//for loops do not need curly braces if it only needs a single line inside the loop
		//An example of this are the next two for loops.  This only allows for cleaner code.
		for spaceIndex := 0; spaceIndex < spaceCount; spaceIndex++ {
			halfPyramidToPrint += " "
		}

		for hashIndex := 0; hashIndex < hashCount; hashIndex++ {
			halfPyramidToPrint += "#"
		}
		//This is to go to the next line of the layer.
		halfPyramidToPrint += "\n"
	}
	return halfPyramidToPrint
}

func (p Pyramid) isValidPyramid() bool {
	if p.height < 24 && p.height > 0 {
		return true
	}
	return false
}
