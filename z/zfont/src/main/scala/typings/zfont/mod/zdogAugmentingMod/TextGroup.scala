package typings.zfont.mod.zdogAugmentingMod

import typings.zdog.mod.Group
import typings.zfont.zfontBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class is very similar to {@link Text}, except it acts as a {@link Group} instead, and each text glyph is rendered as its own shape.
  * This is helpful for more advanced use-cases where you need control over each character.
  * @see {@link https://github.com/jaames/zfont#zdogtextgroup Zfont API}
  * @see {@link  Zfont API}
  */
@JSImport("zdog", "TextGroup")
@js.native
class TextGroup[T /* <: MultilineText */] protected () extends Group {
  def this(options: TextGroupOptions[T]) = this()
  
  /**
    * @see {@link TextGroupOptions#color}
    * @see {@link https://github.com/jaames/zfont#color Zfont API}
    */
  var color: String = js.native
  
  /**
    * @see {@link TextGroupOptions#fill}
    * @see {@link https://github.com/jaames/zfont#fill Zfont API}
    */
  var fill: Boolean = js.native
  
  /**
    * @see {@link TextGroupOptions#font}
    * @see {@link https://github.com/jaames/zfont#font-1 Zfont API}
    */
  var font: Font = js.native
  
  /**
    * @see {@link TextGroupOptions#fontSize}
    * @see {@link https://github.com/jaames/zfont#fontsize-1 Zfont API}
    */
  var fontSize: Double = js.native
  
  /**
    * @see {@link TextGroupOptions#stroke}
    * @see {@link https://github.com/jaames/zfont#stroke Zfont API}
    */
  var stroke: Double | `false` = js.native
  
  /**
    * @see {@link TextGroupOptions#textAlign}
    * @see {@link https://github.com/jaames/zfont#textalign-1 Zfont API}
    */
  var textAlign: TextAlign = js.native
  
  /**
    * @see {@link TextGroupOptions#textBaseline}
    * @see {@link https://github.com/jaames/zfont#textbaseline-1 Zfont API}
    */
  var textBaseline: TextBaseline = js.native
  
  /**
    * @see {@link TextGroupOptions#value}
    * @see {@link https://github.com/jaames/zfont#value-1 Zfont API}
    */
  var value: T = js.native
}
