package typings.zfont

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.zdog.zdogMod.IllustrationOptions
import typings.zfont.zfontMod.zdogMod.FontOptions
import typings.zfont.zfontMod.zdogMod.MultilineText
import typings.zfont.zfontMod.zdogMod.TextGroupOptions
import typings.zfont.zfontMod.zdogMod.TextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofzdog extends js.Object {
  var Anchor: Instantiable0[typings.zdog.zdogMod.Anchor] = js.native
  var Box: Instantiable0[typings.zdog.zdogMod.Box] = js.native
  var Cone: Instantiable0[typings.zdog.zdogMod.Cone] = js.native
  var Cylinder: Instantiable0[typings.zdog.zdogMod.Cylinder] = js.native
  var Dragger: Instantiable0[typings.zdog.zdogMod.Dragger] = js.native
  var Ellipse: Instantiable0[typings.zdog.zdogMod.Ellipse] = js.native
  /**
    * Represents a font that can be used by an instance of either {@link Text} or {@link TextGroup}.
    * @see {@link https://github.com/jaames/zfont#zdogfont Zfont API}
    */
  var Font: Instantiable1[/* options */ FontOptions, typings.zfont.zfontMod.zdogMod.Font] = js.native
  var Group: Instantiable0[typings.zdog.zdogMod.Group] = js.native
  var Hemisphere: Instantiable0[typings.zdog.zdogMod.Hemisphere] = js.native
  var Illustration: Instantiable1[/* options */ IllustrationOptions, typings.zdog.zdogMod.Illustration] = js.native
  var Polygon: Instantiable0[typings.zdog.zdogMod.Polygon] = js.native
  var Rect: Instantiable0[typings.zdog.zdogMod.Rect] = js.native
  var RoundedRect: Instantiable0[typings.zdog.zdogMod.RoundedRect] = js.native
  var Shape: Instantiable0[typings.zdog.zdogMod.Shape] = js.native
  val TAU: Double = js.native
  /**
    * An object used for rendering text.
    * @see {@link https://github.com/jaames/zfont#zdogtext Zfont API}
    */
  var Text: Instantiable1[
    /* options */ TextOptions[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
    typings.zfont.zfontMod.zdogMod.Text[MultilineText]
  ] = js.native
  /**
    * This class is very similar to {@link Text}, except it acts as a {@link Group} instead, and each text glyph is rendered as its own shape.
    * This is helpful for more advanced use-cases where you need control over each character.
    * @see {@link https://github.com/jaames/zfont#zdogtextgroup Zfont API}
    * @see {@link  Zfont API}
    */
  var TextGroup: Instantiable1[
    /* options */ TextGroupOptions[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
    typings.zfont.zfontMod.zdogMod.TextGroup[MultilineText]
  ] = js.native
  var Vector: Instantiable0[typings.zdog.zdogMod.Vector] = js.native
  def easeInOut(alpha: Double): Double = js.native
  def easeInOut(alpha: Double, power: Double): Double = js.native
  def extend[T](a: T): T = js.native
  def extend[T](a: T, b: T): T = js.native
  def lerp(a: Double, b: Double, alpha: Double): Double = js.native
  def modulo(a: Double, b: Double): Double = js.native
  /**
    * Returns a {@link Promise} which resolves as soon as all the fonts currently added to the scene are loaded and ready for use.
    * @see {@link https://github.com/jaames/zfont#zdogtext Zfont API}
    */
  def waitForFonts(): js.Promise[js.Array[js.UndefOr[scala.Nothing]]] = js.native
}

