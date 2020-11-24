package typings.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aspect extends js.Object {
  
  /**
    * To set the layout of the word cloud. "spiral" | "flow-center" | "flow-top"
    */
  var aspect: js.UndefOr[String] = js.native
  
  var button: js.UndefOr[Count] = js.native
  
  /**
    * When the "color-type" attribute is set to "color", use this attribute to set the color of the text in the word cloud. "red" | "#3F
    * 51B5" | ...
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * To set the type of color arrangement applied to the word cloud. Use the "color" value with the "color" attribute. Use the "palette
    * " value with the "palette" array. "random" (default) | "color" | "palette"
    */
  var `color-type`: js.UndefOr[String] = js.native
  
  var `context-menu`: js.UndefOr[Button] = js.native
  
  /**
    * To define words to be excluded from the word cloud, e.g., "and" or "the". [...]
    */
  var ignore: js.UndefOr[js.Any] = js.native
  
  var indicator: js.UndefOr[Npv] = js.native
  
  /**
    * To set the maximum font size. 20 | "30px" | ...
    */
  var `max-font-size`: js.UndefOr[js.Any] = js.native
  
  /**
    * To set the maximum number of items displayed in the word cloud. 100 | 30 | ...
    */
  var `max-items`: js.UndefOr[js.Any] = js.native
  
  /**
    * To set the minimum font size. 10 | "12px" | ...
    */
  var `min-font-size`: js.UndefOr[js.Any] = js.native
  
  /**
    * To set the minimum length of the words displayed in the word cloud. 3 | 5 | ...
    */
  var `min-length`: js.UndefOr[js.Any] = js.native
  
  /**
    * When the "color-type" attribute is set to "palette", use this attribute to set the color palette of the word cloud. [...]
    */
  var palette: js.UndefOr[js.Any] = js.native
  
  /**
    * To set whether every one or two words rotates 90 degrees. true | false (default)
    */
  var rotate: js.UndefOr[Boolean] = js.native
  
  /**
    * To control the step metering. Use this with the "step-radius" attribute. 45 | 90 | ...
    */
  var `step-angle`: js.UndefOr[js.Any] = js.native
  
  /**
    * To control the step metering. Use this with the "step-angle" attribute. 30 | 50 | ...
    */
  var `step-radius`: js.UndefOr[js.Any] = js.native
  
  var style: js.UndefOr[Hoverstate] = js.native
  
  /**
    * To provide the data for the word cloud. (Alternatively, data can be provided through a "words" array.) "text data..." | ...
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * To set the type of item to be analyzed: words or characters. "word" (default) | "character"
    */
  var token: js.UndefOr[String] = js.native
  
  var violin: js.UndefOr[Jitter] = js.native
  
  var words: js.UndefOr[js.Array[Text]] = js.native
}
object Aspect {
  
  @scala.inline
  def apply(): Aspect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aspect]
  }
  
  @scala.inline
  implicit class AspectOps[Self <: Aspect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAspect(value: String): Self = this.set("aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspect: Self = this.set("aspect", js.undefined)
    
    @scala.inline
    def setButton(value: Count): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def `setColor-type`(value: String): Self = this.set("color-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteColor-type`: Self = this.set("color-type", js.undefined)
    
    @scala.inline
    def `setContext-menu`(value: Button): Self = this.set("context-menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteContext-menu`: Self = this.set("context-menu", js.undefined)
    
    @scala.inline
    def setIgnore(value: js.Any): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setIndicator(value: Npv): Self = this.set("indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicator: Self = this.set("indicator", js.undefined)
    
    @scala.inline
    def `setMax-font-size`(value: js.Any): Self = this.set("max-font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-font-size`: Self = this.set("max-font-size", js.undefined)
    
    @scala.inline
    def `setMax-items`(value: js.Any): Self = this.set("max-items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-items`: Self = this.set("max-items", js.undefined)
    
    @scala.inline
    def `setMin-font-size`(value: js.Any): Self = this.set("min-font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMin-font-size`: Self = this.set("min-font-size", js.undefined)
    
    @scala.inline
    def `setMin-length`(value: js.Any): Self = this.set("min-length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMin-length`: Self = this.set("min-length", js.undefined)
    
    @scala.inline
    def setPalette(value: js.Any): Self = this.set("palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    
    @scala.inline
    def setRotate(value: Boolean): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def `setStep-angle`(value: js.Any): Self = this.set("step-angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStep-angle`: Self = this.set("step-angle", js.undefined)
    
    @scala.inline
    def `setStep-radius`(value: js.Any): Self = this.set("step-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStep-radius`: Self = this.set("step-radius", js.undefined)
    
    @scala.inline
    def setStyle(value: Hoverstate): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setViolin(value: Jitter): Self = this.set("violin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViolin: Self = this.set("violin", js.undefined)
    
    @scala.inline
    def setWordsVarargs(value: Text*): Self = this.set("words", js.Array(value :_*))
    
    @scala.inline
    def setWords(value: js.Array[Text]): Self = this.set("words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
}
