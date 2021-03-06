package com.draabek.fractal.palette;

/** A color palette (sequence of colors from 0 to getSize())
 * @author Vojtech Drabek
 *
 */
public interface ColorPalette {
	public int getColorInt(float intensity);
	public int[] getColorsInt();
}
