package typings.zwlogBrowser

import typings.zwlogBrowser.zwlogBrowserStrings.`01`
import typings.zwlogBrowser.zwlogBrowserStrings.`02`
import typings.zwlogBrowser.zwlogBrowserStrings.bj
import typings.zwlogBrowser.zwlogBrowserStrings.cj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait C1 extends StObject {
    
    /**
      * 常规业务：taSR；医疗或医保业务：taSR_YL
      */
    var c1: String
    
    /**
      * 填写具体业务名称，如“余额查询”
      */
    var title: String
    
    /**
      * H5 服务 url
      */
    var url: String
  }
  object C1 {
    
    inline def apply(c1: String, title: String, url: String): C1 = {
      val __obj = js.Dynamic.literal(c1 = c1.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[C1]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: C1] (val x: Self) extends AnyVal {
      
      inline def setC1(value: String): Self = StObject.set(x, "c1", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Logstatus extends StObject {
    
    /**
      * 用户登录状态（01:未登录/ 02:单点登录）
      */
    var log_status: `01` | `02`
    
    /**
      * IRS 服务侧应用 appid,
      */
    var miniAppId: String
    
    /**
      * IRS 服务侧应用 appname,
      */
    var miniAppName: String
    
    /**
      * 页面 ID
      */
    var pageId: String
    
    /**
      * 页面名称
      */
    var pageName: String
    
    /**
      * 页面启动到页面响应完成的时间
      */
    var t0: Double
    
    /**
      * 页面启动到加载完成的时间
      */
    var t2: Double
  }
  object Logstatus {
    
    inline def apply(
      log_status: `01` | `02`,
      miniAppId: String,
      miniAppName: String,
      pageId: String,
      pageName: String,
      t0: Double,
      t2: Double
    ): Logstatus = {
      val __obj = js.Dynamic.literal(log_status = log_status.asInstanceOf[js.Any], miniAppId = miniAppId.asInstanceOf[js.Any], miniAppName = miniAppName.asInstanceOf[js.Any], pageId = pageId.asInstanceOf[js.Any], pageName = pageName.asInstanceOf[js.Any], t0 = t0.asInstanceOf[js.Any], t2 = t2.asInstanceOf[js.Any])
      __obj.asInstanceOf[Logstatus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Logstatus] (val x: Self) extends AnyVal {
      
      inline def setLog_status(value: `01` | `02`): Self = StObject.set(x, "log_status", value.asInstanceOf[js.Any])
      
      inline def setMiniAppId(value: String): Self = StObject.set(x, "miniAppId", value.asInstanceOf[js.Any])
      
      inline def setMiniAppName(value: String): Self = StObject.set(x, "miniAppName", value.asInstanceOf[js.Any])
      
      inline def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
      
      inline def setPageName(value: String): Self = StObject.set(x, "pageName", value.asInstanceOf[js.Any])
      
      inline def setT0(value: Double): Self = StObject.set(x, "t0", value.asInstanceOf[js.Any])
      
      inline def setT2(value: Double): Self = StObject.set(x, "t2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    /**
      * 固定值，针对涉及“拆解”业务；
      */
    var name: cj
    
    /**
      * 业务数据
      */
    var obj: C1
  }
  object Name {
    
    inline def apply(obj: C1): Name = {
      val __obj = js.Dynamic.literal(name = "cj", obj = obj.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: cj): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObj(value: C1): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    }
  }
  
  trait Obj extends StObject {
    
    /**
      * 固定值，针对涉及“办结”业务
      */
    var name: bj
    
    /**
      * 业务数据
      */
    var obj: Success
  }
  object Obj {
    
    inline def apply(obj: Success): Obj = {
      val __obj = js.Dynamic.literal(name = "bj", obj = obj.asInstanceOf[js.Any])
      __obj.asInstanceOf[Obj]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Obj] (val x: Self) extends AnyVal {
      
      inline def setName(value: bj): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObj(value: Success): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sdkinfo extends StObject {
    
    var sdk_info: String
    
    var sdk_version: String
  }
  object Sdkinfo {
    
    inline def apply(sdk_info: String, sdk_version: String): Sdkinfo = {
      val __obj = js.Dynamic.literal(sdk_info = sdk_info.asInstanceOf[js.Any], sdk_version = sdk_version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sdkinfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sdkinfo] (val x: Self) extends AnyVal {
      
      inline def setSdk_info(value: String): Self = StObject.set(x, "sdk_info", value.asInstanceOf[js.Any])
      
      inline def setSdk_version(value: String): Self = StObject.set(x, "sdk_version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Success extends StObject {
    
    /**
      * 常规业务：taSR；医疗或医保业务：taSR_YL
      */
    var c1: String
    
    /**
      * 办结成功或失败
      */
    var success: Boolean
    
    /**
      * 服务耗时，无法统计填写 0
      */
    var time: Double
    
    /**
      * 填写具体业务名称，如“余额查询”
      */
    var title: String
  }
  object Success {
    
    inline def apply(c1: String, success: Boolean, time: Double, title: String): Success = {
      val __obj = js.Dynamic.literal(c1 = c1.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Success]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Success] (val x: Self) extends AnyVal {
      
      inline def setC1(value: String): Self = StObject.set(x, "c1", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  aplus-cpvdata :{  sdk_info :string,   sdk_version :string},   aplus-exdata :{  sdk_info :string,   sdk_version :string},   aplus-rhost-g :string,   aplus-rhost-v :string,   aplus-waiting :string,   appId :string} & zwlog-browser.ZwLogInitOptions */
  trait apluscpvdatasdkinfostring extends StObject {
    
    /**
      * 用户ID
      */
    var _user_id: String
    
    /**
      * 用户昵称
      */
    var _user_nick: String
    
    var `aplus-cpvdata`: Sdkinfo
    
    var `aplus-exdata`: Sdkinfo
    
    var `aplus-rhost-g`: String
    
    var `aplus-rhost-v`: String
    
    var `aplus-waiting`: String
    
    var appId: String
  }
  object apluscpvdatasdkinfostring {
    
    inline def apply(
      _user_id: String,
      _user_nick: String,
      `aplus-cpvdata`: Sdkinfo,
      `aplus-exdata`: Sdkinfo,
      `aplus-rhost-g`: String,
      `aplus-rhost-v`: String,
      `aplus-waiting`: String,
      appId: String
    ): apluscpvdatasdkinfostring = {
      val __obj = js.Dynamic.literal(_user_id = _user_id.asInstanceOf[js.Any], _user_nick = _user_nick.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
      __obj.updateDynamic("aplus-cpvdata")(`aplus-cpvdata`.asInstanceOf[js.Any])
      __obj.updateDynamic("aplus-exdata")(`aplus-exdata`.asInstanceOf[js.Any])
      __obj.updateDynamic("aplus-rhost-g")(`aplus-rhost-g`.asInstanceOf[js.Any])
      __obj.updateDynamic("aplus-rhost-v")(`aplus-rhost-v`.asInstanceOf[js.Any])
      __obj.updateDynamic("aplus-waiting")(`aplus-waiting`.asInstanceOf[js.Any])
      __obj.asInstanceOf[apluscpvdatasdkinfostring]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: apluscpvdatasdkinfostring] (val x: Self) extends AnyVal {
      
      inline def `setAplus-cpvdata`(value: Sdkinfo): Self = StObject.set(x, "aplus-cpvdata", value.asInstanceOf[js.Any])
      
      inline def `setAplus-exdata`(value: Sdkinfo): Self = StObject.set(x, "aplus-exdata", value.asInstanceOf[js.Any])
      
      inline def `setAplus-rhost-g`(value: String): Self = StObject.set(x, "aplus-rhost-g", value.asInstanceOf[js.Any])
      
      inline def `setAplus-rhost-v`(value: String): Self = StObject.set(x, "aplus-rhost-v", value.asInstanceOf[js.Any])
      
      inline def `setAplus-waiting`(value: String): Self = StObject.set(x, "aplus-waiting", value.asInstanceOf[js.Any])
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def set_user_id(value: String): Self = StObject.set(x, "_user_id", value.asInstanceOf[js.Any])
      
      inline def set_user_nick(value: String): Self = StObject.set(x, "_user_nick", value.asInstanceOf[js.Any])
    }
  }
}
