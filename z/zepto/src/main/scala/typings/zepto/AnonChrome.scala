package typings.zepto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChrome extends js.Object {
  /**
  		* Specific browser
  		**/
  var chrome: Boolean
  var firefox: Boolean
  var playbook: Boolean
  var silk: Boolean
  /**
  		* Browser version.
  		**/
  var version: String
}

object AnonChrome {
  @scala.inline
  def apply(chrome: Boolean, firefox: Boolean, playbook: Boolean, silk: Boolean, version: String): AnonChrome = {
    val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], playbook = playbook.asInstanceOf[js.Any], silk = silk.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChrome]
  }
}

