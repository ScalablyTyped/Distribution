package typings.yup

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var params: StringDictionary[js.Any]
}

object AnonName {
  @scala.inline
  def apply(name: String, params: StringDictionary[js.Any]): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

