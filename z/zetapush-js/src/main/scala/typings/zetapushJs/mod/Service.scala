package typings.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var DEFAULT_DEPLOYMENT_ID: String
}

object Service {
  @scala.inline
  def apply(DEFAULT_DEPLOYMENT_ID: String): Service = {
    val __obj = js.Dynamic.literal(DEFAULT_DEPLOYMENT_ID = DEFAULT_DEPLOYMENT_ID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Service]
  }
}

