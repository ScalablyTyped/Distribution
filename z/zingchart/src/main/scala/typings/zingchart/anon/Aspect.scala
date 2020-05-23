package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aspect extends js.Object {
  /**
    * To set the layout of the word cloud. "spiral" | "flow-center" | "flow-top"
    */
  var aspect: js.UndefOr[String] = js.undefined
  var button: js.UndefOr[Count] = js.undefined
  /**
    * When the "color-type" attribute is set to "color", use this attribute to set the color of the text in the word cloud. "red" | "#3F
    * 51B5" | ...
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * To set the type of color arrangement applied to the word cloud. Use the "color" value with the "color" attribute. Use the "palette
    * " value with the "palette" array. "random" (default) | "color" | "palette"
    */
  var `color-type`: js.UndefOr[String] = js.undefined
  var `context-menu`: js.UndefOr[Button] = js.undefined
  /**
    * To define words to be excluded from the word cloud, e.g., "and" or "the". [...]
    */
  var ignore: js.UndefOr[js.Any] = js.undefined
  var indicator: js.UndefOr[Npv] = js.undefined
  /**
    * To set the maximum font size. 20 | "30px" | ...
    */
  var `max-font-size`: js.UndefOr[js.Any] = js.undefined
  /**
    * To set the maximum number of items displayed in the word cloud. 100 | 30 | ...
    */
  var `max-items`: js.UndefOr[js.Any] = js.undefined
  /**
    * To set the minimum font size. 10 | "12px" | ...
    */
  var `min-font-size`: js.UndefOr[js.Any] = js.undefined
  /**
    * To set the minimum length of the words displayed in the word cloud. 3 | 5 | ...
    */
  var `min-length`: js.UndefOr[js.Any] = js.undefined
  /**
    * When the "color-type" attribute is set to "palette", use this attribute to set the color palette of the word cloud. [...]
    */
  var palette: js.UndefOr[js.Any] = js.undefined
  /**
    * To set whether every one or two words rotates 90 degrees. true | false (default)
    */
  var rotate: js.UndefOr[Boolean] = js.undefined
  /**
    * To control the step metering. Use this with the "step-radius" attribute. 45 | 90 | ...
    */
  var `step-angle`: js.UndefOr[js.Any] = js.undefined
  /**
    * To control the step metering. Use this with the "step-angle" attribute. 30 | 50 | ...
    */
  var `step-radius`: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[Hoverstate] = js.undefined
  /**
    * To provide the data for the word cloud. (Alternatively, data can be provided through a "words" array.) "text data..." | ...
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * To set the type of item to be analyzed: words or characters. "word" (default) | "character"
    */
  var token: js.UndefOr[String] = js.undefined
  var violin: js.UndefOr[Jitter] = js.undefined
  var words: js.UndefOr[js.Array[Text]] = js.undefined
}

object Aspect {
  @scala.inline
  def apply(
    aspect: String = null,
    button: Count = null,
    color: String = null,
    `color-type`: String = null,
    `context-menu`: Button = null,
    ignore: js.Any = null,
    indicator: Npv = null,
    `max-font-size`: js.Any = null,
    `max-items`: js.Any = null,
    `min-font-size`: js.Any = null,
    `min-length`: js.Any = null,
    palette: js.Any = null,
    rotate: js.UndefOr[Boolean] = js.undefined,
    `step-angle`: js.Any = null,
    `step-radius`: js.Any = null,
    style: Hoverstate = null,
    text: String = null,
    token: String = null,
    violin: Jitter = null,
    words: js.Array[Text] = null
  ): Aspect = {
    val __obj = js.Dynamic.literal()
    if (aspect != null) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`color-type` != null) __obj.updateDynamic("color-type")(`color-type`.asInstanceOf[js.Any])
    if (`context-menu` != null) __obj.updateDynamic("context-menu")(`context-menu`.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (indicator != null) __obj.updateDynamic("indicator")(indicator.asInstanceOf[js.Any])
    if (`max-font-size` != null) __obj.updateDynamic("max-font-size")(`max-font-size`.asInstanceOf[js.Any])
    if (`max-items` != null) __obj.updateDynamic("max-items")(`max-items`.asInstanceOf[js.Any])
    if (`min-font-size` != null) __obj.updateDynamic("min-font-size")(`min-font-size`.asInstanceOf[js.Any])
    if (`min-length` != null) __obj.updateDynamic("min-length")(`min-length`.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (`step-angle` != null) __obj.updateDynamic("step-angle")(`step-angle`.asInstanceOf[js.Any])
    if (`step-radius` != null) __obj.updateDynamic("step-radius")(`step-radius`.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (violin != null) __obj.updateDynamic("violin")(violin.asInstanceOf[js.Any])
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aspect]
  }
}

