package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * color
  */
@js.native
trait Color extends js.Object {
  
  def contrast(dark: String, light: String, threshold: Double): String = js.native
  
  def darken(percent: Double): String = js.native
  
  def fade(percent: Double): js.Any = js.native
  
  def hexStr(): String = js.native
  
  def hue(hue: String): String = js.native
  
  def lighten(percent: Double): String = js.native
  
  def luma(): String = js.native
  
  def rgb(): js.Object = js.native
  def rgb(rgbaColor: String): js.Object = js.native
  
  def saturate(): String = js.native
  
  def toCssStr(): String = js.native
  
  def toHsl(): js.Object = js.native
}
