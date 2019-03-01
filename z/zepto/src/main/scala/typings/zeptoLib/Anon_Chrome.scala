package typings
package zeptoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chrome extends js.Object {
  /**
  		* Specific browser
  		**/
  var chrome: scala.Boolean
  var firefox: scala.Boolean
  var playbook: scala.Boolean
  var silk: scala.Boolean
  /**
  		* Browser version.
  		**/
  var version: java.lang.String
}

object Anon_Chrome {
  @scala.inline
  def apply(
    chrome: scala.Boolean,
    firefox: scala.Boolean,
    playbook: scala.Boolean,
    silk: scala.Boolean,
    version: java.lang.String
  ): Anon_Chrome = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chrome")(chrome)
    __obj.updateDynamic("firefox")(firefox)
    __obj.updateDynamic("playbook")(playbook)
    __obj.updateDynamic("silk")(silk)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Chrome]
  }
}

