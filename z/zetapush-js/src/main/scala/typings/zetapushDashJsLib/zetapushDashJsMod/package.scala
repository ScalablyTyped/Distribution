package typings
package zetapushDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zetapushDashJsMod {
  type AsyncMacroServicePublisher = js.Function4[
    /* method */ java.lang.String, 
    /* parameters */ js.UndefOr[PublishParameters], 
    /* hardFail */ js.UndefOr[scala.Boolean], 
    /* debug */ js.UndefOr[scala.Double], 
    js.Promise[js.Any]
  ]
  type AuthenticationCallback = js.Function0[AbstractHandshake]
  type MacroServicePublisher = js.Function4[
    /* method */ java.lang.String, 
    /* parameters */ js.UndefOr[PublishParameters], 
    /* hardFail */ js.UndefOr[scala.Boolean], 
    /* debug */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  type PublishParameters = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ServicePublisher = js.Function2[/* method */ java.lang.String, /* parameters */ js.Any, scala.Unit]
}
