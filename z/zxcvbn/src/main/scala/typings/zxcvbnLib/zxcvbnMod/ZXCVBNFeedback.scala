package typings
package zxcvbnLib.zxcvbnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZXCVBNFeedback extends js.Object {
  /**
    * a possibly-empty list of suggestions to help choose a less
    * guessable password. eg. 'Add another word or two'
    */
  var suggestions: js.Array[java.lang.String]
  /**
    * explains what's wrong, eg. 'this is a top-10 common password'.
    * not always set -- sometimes an empty string
    */
  var warning: java.lang.String
}

object ZXCVBNFeedback {
  @scala.inline
  def apply(suggestions: js.Array[java.lang.String], warning: java.lang.String): ZXCVBNFeedback = {
    val __obj = js.Dynamic.literal(suggestions = suggestions, warning = warning)
  
    __obj.asInstanceOf[ZXCVBNFeedback]
  }
}

