package typings
package zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OAuth2Authentication[InputData] extends js.Object {
  var connectionLabel: java.lang.String
  var oauth2Config: zapierDashPlatformDashCoreLib.Anon_Scope[InputData]
  var test: (js.Function2[
    /* z */ Z, 
    /* bundle */ Bundle[InputData], 
    scala.Boolean | stdLib.Promise[scala.Boolean]
  ]) | zapierDashPlatformDashCoreLib.Anon_Url
  var `type`: zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreLibStrings.oauth2
}

