package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * color
  */
@js.native
trait Color extends js.Object {
  def contrast(dark: java.lang.String, light: java.lang.String, threshold: scala.Double): java.lang.String = js.native
  def darken(percent: scala.Double): java.lang.String = js.native
  def fade(percent: scala.Double): js.Any = js.native
  def hexStr(): java.lang.String = js.native
  def hue(hue: java.lang.String): java.lang.String = js.native
  def lighten(percent: scala.Double): java.lang.String = js.native
  def luma(): java.lang.String = js.native
  def rgb(): js.Object = js.native
  def rgb(rgbaColor: java.lang.String): js.Object = js.native
  def saturate(): java.lang.String = js.native
  def toCssStr(): java.lang.String = js.native
  def toHsl(): js.Object = js.native
}

