package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2Authentication[InputData] extends js.Object {
  var connectionLabel: java.lang.String
  var oauth2Config: zapierDashPlatformDashCoreLib.Anon_AuthorizeUrl[InputData]
  var test: (js.Function2[/* z */ Z, /* bundle */ Bundle[InputData], scala.Boolean | js.Promise[scala.Boolean]]) | zapierDashPlatformDashCoreLib.Anon_Url
  var `type`: zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.oauth2
}

object OAuth2Authentication {
  @scala.inline
  def apply[InputData](
    connectionLabel: java.lang.String,
    oauth2Config: zapierDashPlatformDashCoreLib.Anon_AuthorizeUrl[InputData],
    test: (js.Function2[/* z */ Z, /* bundle */ Bundle[InputData], scala.Boolean | js.Promise[scala.Boolean]]) | zapierDashPlatformDashCoreLib.Anon_Url,
    `type`: zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.oauth2
  ): OAuth2Authentication[InputData] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("connectionLabel")(connectionLabel)
    __obj.updateDynamic("oauth2Config")(oauth2Config)
    __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2Authentication[InputData]]
  }
}

