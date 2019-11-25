package typings.zxcvbn.zxcvbnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZXCVBNFeedback extends js.Object {
  /**
    * a possibly-empty list of suggestions to help choose a less
    * guessable password. eg. 'Add another word or two'
    */
  var suggestions: js.Array[String]
  /**
    * explains what's wrong, eg. 'this is a top-10 common password'.
    * not always set -- sometimes an empty string
    */
  var warning: String
}

object ZXCVBNFeedback {
  @scala.inline
  def apply(suggestions: js.Array[String], warning: String): ZXCVBNFeedback = {
    val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ZXCVBNFeedback]
  }
}

