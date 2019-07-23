package model

import java.awt.Color
import java.awt.image.BufferedImage

/********************************************************************************************************************
 * @author ednaldo martins                                                                                          *
 * created on july 23, 2019                                                                                         *
 *******************************************************************************************************************/
class RedFilterBlackWhite: Filter {
    override fun filtrate(bufferedImage: BufferedImage) {
        val imgWriter = bufferedImage.raster

        for (i in 0 until bufferedImage.width) {
            for (j in 0 until bufferedImage.height) {
                val v = intArrayOf(Color(bufferedImage.getRGB(i, j)).red, Color(bufferedImage.getRGB(i, j)).red, Color(bufferedImage.getRGB(i, j)).red)
                imgWriter.setPixel(i, j, v)
            }
        }
    }
}