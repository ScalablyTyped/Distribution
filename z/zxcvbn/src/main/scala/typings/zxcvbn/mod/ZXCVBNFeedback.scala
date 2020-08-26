package typings.zxcvbn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZXCVBNFeedback extends js.Object {
  /**
    * a possibly-empty list of suggestions to help choose a less
    * guessable password. eg. 'Add another word or two'
    */
  var suggestions: js.Array[String] = js.native
  /**
    * explains what's wrong, eg. 'this is a top-10 common password'.
    * not always set -- sometimes an empty string
    */
  var warning: String = js.native
}

object ZXCVBNFeedback {
  @scala.inline
  def apply(suggestions: js.Array[String], warning: String): ZXCVBNFeedback = {
    val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZXCVBNFeedback]
  }
  @scala.inline
  implicit class ZXCVBNFeedbackOps[Self <: ZXCVBNFeedback] (val x: Self) extends AnyVal {
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
    def setSuggestionsVarargs(value: String*): Self = this.set("suggestions", js.Array(value :_*))
    @scala.inline
    def setSuggestions(value: js.Array[String]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarning(value: String): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
  
}

