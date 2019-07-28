package typings.zepto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chrome extends js.Object {
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

object Anon_Chrome {
  @scala.inline
  def apply(chrome: Boolean, firefox: Boolean, playbook: Boolean, silk: Boolean, version: String): Anon_Chrome = {
    val __obj = js.Dynamic.literal(chrome = chrome, firefox = firefox, playbook = playbook, silk = silk, version = version)
  
    __obj.asInstanceOf[Anon_Chrome]
  }
}

