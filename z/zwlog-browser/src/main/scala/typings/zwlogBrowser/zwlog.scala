package typings.zwlogBrowser

import typings.std.Record
import typings.zwlogBrowser.anon.Logstatus
import typings.zwlogBrowser.anon.Name
import typings.zwlogBrowser.anon.Obj
import typings.zwlogBrowser.anon.apluscpvdatasdkinfostring
import typings.zwlogBrowser.zwlogBrowserStrings.CLK
import typings.zwlogBrowser.zwlogBrowserStrings.EXP
import typings.zwlogBrowser.zwlogBrowserStrings.OTHER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait zwlog extends StObject {
  
  var cbQueue: js.Array[Any] = js.native
  
  def init(): Unit = js.native
  
  var metaInfo: apluscpvdatasdkinfostring = js.native
  
  /**
    * 初始化jsapi，初始化完成即onReady之后再调用jsapi。
    *
    * @param callBack 初始化成功回调
    */
  def onReady(callBack: js.Function0[Unit]): Unit = js.native
  
  var readyFlag: Boolean = js.native
  
  def record(
    /**
    * 注册的事件编码 可传空值或特定事件指定编码
    */
  trackerEventCode: String,
    /**
    * 时间类型 取值为'EXP':⾃定义曝光事件/'CLK':⾃定义点击事件/'OTHER': 其他⾃定义事件
    */
  eventType: EXP | CLK | OTHER,
    /**
    * 本次事件中上报的事件参数. 其取值为⼀个 JSON 对象（平铺的简单对象，不能多层嵌套）
    * JSON 中的 key 不能是以下保留属性：uidaplus,spm-url,spmpre,spm_cnt,pvid,_dev_id,_anony_id,_user_id,_user_nick,_session_id
    */
  eventParams: Record[String, Any]
  ): Unit = js.native
  /**
    * 令箭日志
    *
    * @param data
    */
  def record(
    /**
    * 注册的事件编码 可传空值或特定事件指定编码
    */
  trackerEventCode: String,
    /**
    * 时间类型 取值为'EXP':⾃定义曝光事件/'CLK':⾃定义点击事件/'OTHER': 其他⾃定义事件
    */
  eventType: String,
    /**
    * 本次事件中上报的事件参数. 其取值为⼀个 JSON 对象（平铺的简单对象，不能多层嵌套）
    * JSON 中的 key 不能是以下保留属性：uidaplus,spm-url,spmpre,spm_cnt,pvid,_dev_id,_anony_id,_user_id,_user_nick,_session_id
    */
  eventParams: Record[String, Any]
  ): Unit = js.native
  
  /**
    * 支付宝上报采集
    *
    * @param data
    */
  def sendAliMonitor(data: Name): Unit = js.native
  def sendAliMonitor(data: Obj): Unit = js.native
  
  /**
    * PV日志
    *
    * @param data
    */
  def sendPV(data: Logstatus): Unit = js.native
}
