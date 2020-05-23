package typings.zfont

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.zdog.mod.IllustrationOptions
import typings.zfont.mod.zdogAugmentingMod.FontOptions
import typings.zfont.mod.zdogAugmentingMod.MultilineText
import typings.zfont.mod.zdogAugmentingMod.TextGroupOptions
import typings.zfont.mod.zdogAugmentingMod.TextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Typeofzdog extends js.Object {
    var Anchor: Instantiable0[typings.zdog.mod.Anchor] = js.native
    var Box: Instantiable0[typings.zdog.mod.Box] = js.native
    var Cone: Instantiable0[typings.zdog.mod.Cone] = js.native
    var Cylinder: Instantiable0[typings.zdog.mod.Cylinder] = js.native
    var Dragger: Instantiable0[typings.zdog.mod.Dragger] = js.native
    var Ellipse: Instantiable0[typings.zdog.mod.Ellipse] = js.native
    /**
      * Represents a font that can be used by an instance of either {@link Text} or {@link TextGroup}.
      * @see {@link https://github.com/jaames/zfont#zdogfont Zfont API}
      */
    var Font: Instantiable1[/* options */ FontOptions, typings.zfont.mod.zdogAugmentingMod.Font] = js.native
    var Group: Instantiable0[typings.zdog.mod.Group] = js.native
    var Hemisphere: Instantiable0[typings.zdog.mod.Hemisphere] = js.native
    var Illustration: Instantiable1[/* options */ IllustrationOptions, typings.zdog.mod.Illustration] = js.native
    var Polygon: Instantiable0[typings.zdog.mod.Polygon] = js.native
    var Rect: Instantiable0[typings.zdog.mod.Rect] = js.native
    var RoundedRect: Instantiable0[typings.zdog.mod.RoundedRect] = js.native
    var Shape: Instantiable0[typings.zdog.mod.Shape] = js.native
    val TAU: Double = js.native
    /**
      * An object used for rendering text.
      * @see {@link https://github.com/jaames/zfont#zdogtext Zfont API}
      */
    var Text: Instantiable1[
        /* options */ TextOptions[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
        typings.zfont.mod.zdogAugmentingMod.Text[MultilineText]
      ] = js.native
    /**
      * This class is very similar to {@link Text}, except it acts as a {@link Group} instead, and each text glyph is rendered as its own shape.
      * This is helpful for more advanced use-cases where you need control over each character.
      * @see {@link https://github.com/jaames/zfont#zdogtextgroup Zfont API}
      * @see {@link  Zfont API}
      */
    var TextGroup: Instantiable1[
        /* options */ TextGroupOptions[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
        typings.zfont.mod.zdogAugmentingMod.TextGroup[MultilineText]
      ] = js.native
    var Vector: Instantiable0[typings.zdog.mod.Vector] = js.native
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
  
}

