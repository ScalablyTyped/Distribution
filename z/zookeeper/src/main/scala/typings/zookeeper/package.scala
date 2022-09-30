package typings.zookeeper

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * ACL callback
  */
type aclCb = js.Function4[/* rc */ Double, /* error */ Double, /* acl */ acl, /* stat */ stat, Any]

/**
  * Child2 callback
  */
type child2Cb = js.Function4[
/* rc */ Double, 
/* error */ Double, 
/* children */ js.Array[String], 
/* stat */ stat, 
Any]

/**
  * Child callback
  */
type childCb = js.Function3[/* rc */ Double, /* error */ Double, /* children */ js.Array[String], Any]

/**
  * Connect callback
  */
type connectCb = js.Function2[/* error */ js.Error, /* client */ Any, Any]

/**
  * Data callback
  */
type dataCb = js.Function4[/* rc */ Double, /* error */ Double, /* stat */ stat, /* data */ String | Buffer, Any]

/**
  * Mkdir callback
  */
type mkdirCb = js.Function2[/* error */ js.Error, /* success */ js.UndefOr[Boolean], Any]

/**
  * Path callback
  */
type pathCb = js.Function3[/* rc */ Double, /* error */ Double, /* path */ String, Any]

/**
  * Stat callback
  */
type statCb = js.Function3[/* rc */ Double, /* error */ Double, /* stat */ stat, Any]

/**
  * Value callback
  */
type valueCb = js.Function3[/* rc */ Double, /* error */ Double, /* value */ Any, Any]

/**
  * Void callback
  */
type voidCb = js.Function2[/* rc */ Double, /* error */ Double, Any]

/**
  * Watch callback
  */
type watchCb = js.Function3[/* type */ Double, /* state */ Double, /* path */ String, Any]
