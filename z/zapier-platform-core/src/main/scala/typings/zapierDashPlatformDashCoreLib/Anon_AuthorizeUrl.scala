package typings
package zapierDashPlatformDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthorizeUrl[InputData] extends js.Object {
  var authorizeUrl: java.lang.String | (js.Function2[
    /* z */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.Z, 
    /* bundle */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.AuthorizeUrlBundle[InputData], 
    java.lang.String | js.Promise[java.lang.String]
  ]) | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.HttpRequestOptions
  var autoRefresh: scala.Boolean
  var getAccessToken: (js.Function2[
    /* z */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.Z, 
    /* bundle */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.GetAccessTokenBundle[InputData], 
    zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.AuthData | js.Promise[zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.AuthData]
  ]) | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.HttpRequestOptions
  var refreshAccessToken: js.UndefOr[
    (js.Function2[
      /* z */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.Z, 
      /* bundle */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.RefreshAccessTokenBundle[InputData], 
      zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.AuthData | js.Promise[zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.AuthData]
    ]) | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.HttpRequestOptions
  ] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AuthorizeUrl {
  @scala.inline
  def apply[InputData](
    authorizeUrl: java.lang.String | (js.Function2[
      /* z */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.Z, 
      /* bundle */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.AuthorizeUrlBundle[InputData], 
      java.lang.String | js.Promise[java.lang.String]
    ]) | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.HttpRequestOptions,
    autoRefresh: scala.Boolean,
    getAccessToken: (js.Function2[
      /* z */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.Z, 
      /* bundle */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.GetAccessTokenBundle[InputData], 
      zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.AuthData | js.Promise[zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.AuthData]
    ]) | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.HttpRequestOptions,
    refreshAccessToken: (js.Function2[
      /* z */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.Z, 
      /* bundle */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.RefreshAccessTokenBundle[InputData], 
      zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.AuthData | js.Promise[zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.AuthData]
    ]) | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.HttpRequestOptions = null,
    scope: java.lang.String = null
  ): Anon_AuthorizeUrl[InputData] = {
    val __obj = js.Dynamic.literal(authorizeUrl = authorizeUrl.asInstanceOf[js.Any], autoRefresh = autoRefresh, getAccessToken = getAccessToken.asInstanceOf[js.Any])
    if (refreshAccessToken != null) __obj.updateDynamic("refreshAccessToken")(refreshAccessToken.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Anon_AuthorizeUrl[InputData]]
  }
}

