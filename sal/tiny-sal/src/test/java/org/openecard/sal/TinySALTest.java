/****************************************************************************
 * Copyright (C) 2012 HS Coburg.
 * All rights reserved.
 * Contact: ecsec GmbH (info@ecsec.de)
 *
 * This file is part of the Open eCard App.
 *
 * GNU General Public License Usage
 * This file may be used under the terms of the GNU General Public
 * License version 3.0 as published by the Free Software Foundation
 * and appearing in the file LICENSE.GPL included in the packaging of
 * this file. Please review the following information to ensure the
 * GNU General Public License version 3.0 requirements will be met:
 * http://www.gnu.org/copyleft/gpl.html.
 *
 * Other Usage
 * Alternatively, this file may be used in accordance with the terms
 * and conditions contained in a signed written agreement between
 * you and ecsec GmbH.
 *
 ***************************************************************************/

package org.openecard.sal;

import iso.std.iso_iec._24727.tech.schema.AccessControlListType;
import iso.std.iso_iec._24727.tech.schema.AccessRuleType;
import iso.std.iso_iec._24727.tech.schema.ActionNameType;
import iso.std.iso_iec._24727.tech.schema.APIAccessEntryPointName;   
import iso.std.iso_iec._24727.tech.schema.ACLList;
import iso.std.iso_iec._24727.tech.schema.ACLListResponse;
import iso.std.iso_iec._24727.tech.schema.ACLModify;
import iso.std.iso_iec._24727.tech.schema.ACLModifyResponse;
import iso.std.iso_iec._24727.tech.schema.CardApplicationConnect;
import iso.std.iso_iec._24727.tech.schema.CardApplicationConnectResponse;
import iso.std.iso_iec._24727.tech.schema.CardApplicationCreate;
import iso.std.iso_iec._24727.tech.schema.CardApplicationCreateResponse;
import iso.std.iso_iec._24727.tech.schema.CardApplicationDelete;
import iso.std.iso_iec._24727.tech.schema.CardApplicationDeleteResponse;
import iso.std.iso_iec._24727.tech.schema.CardApplicationDisconnect;
import iso.std.iso_iec._24727.tech.schema.CardApplicationDisconnectResponse;
import iso.std.iso_iec._24727.tech.schema.CardApplicationEndSession;
import iso.std.iso_iec._24727.tech.schema.CardApplicationEndSessionResponse;
import iso.std.iso_iec._24727.tech.schema.CardApplicationList;
import iso.std.iso_iec._24727.tech.schema.CardApplicationListResponse;
import iso.std.iso_iec._24727.tech.schema.CardApplicationPath;
import iso.std.iso_iec._24727.tech.schema.CardApplicationPathResponse;
import iso.std.iso_iec._24727.tech.schema.CardApplicationPathType;
import iso.std.iso_iec._24727.tech.schema.CardApplicationServiceCreate;
import iso.std.iso_iec._24727.tech.schema.CardApplicationServiceCreateResponse;
import iso.std.iso_iec._24727.tech.schema.CardApplicationServiceDelete;
import iso.std.iso_iec._24727.tech.schema.CardApplicationServiceDeleteResponse;
import iso.std.iso_iec._24727.tech.schema.CardApplicationServiceDescribe;
import iso.std.iso_iec._24727.tech.schema.CardApplicationServiceDescribeResponse;
import iso.std.iso_iec._24727.tech.schema.CardApplicationServiceList;
import iso.std.iso_iec._24727.tech.schema.CardApplicationServiceListResponse;
import iso.std.iso_iec._24727.tech.schema.CardApplicationServiceListResponse.CardApplicationServiceNameList;
import iso.std.iso_iec._24727.tech.schema.CardApplicationServiceLoad;
import iso.std.iso_iec._24727.tech.schema.CardApplicationServiceLoadResponse;
import iso.std.iso_iec._24727.tech.schema.CardApplicationStartSession;
import iso.std.iso_iec._24727.tech.schema.CardApplicationStartSessionResponse;
import iso.std.iso_iec._24727.tech.schema.Connect;
import iso.std.iso_iec._24727.tech.schema.ConnectResponse;
import iso.std.iso_iec._24727.tech.schema.ConnectionHandleType;
import iso.std.iso_iec._24727.tech.schema.ConnectionHandleType.RecognitionInfo;
import iso.std.iso_iec._24727.tech.schema.DIDAuthenticate;
import iso.std.iso_iec._24727.tech.schema.DIDAuthenticateResponse;
import iso.std.iso_iec._24727.tech.schema.DIDAuthenticationDataType;
import iso.std.iso_iec._24727.tech.schema.DIDCreate;
import iso.std.iso_iec._24727.tech.schema.DIDCreateResponse;
import iso.std.iso_iec._24727.tech.schema.DIDDelete;
import iso.std.iso_iec._24727.tech.schema.DIDDeleteResponse;
import iso.std.iso_iec._24727.tech.schema.DIDGet;
import iso.std.iso_iec._24727.tech.schema.DIDGetResponse;
import iso.std.iso_iec._24727.tech.schema.DIDList;
import iso.std.iso_iec._24727.tech.schema.DIDListResponse;
import iso.std.iso_iec._24727.tech.schema.DIDQualifierType;
import iso.std.iso_iec._24727.tech.schema.DIDUpdate;
import iso.std.iso_iec._24727.tech.schema.DIDUpdateDataType;
import iso.std.iso_iec._24727.tech.schema.DIDUpdateResponse;
import iso.std.iso_iec._24727.tech.schema.DSICreate;
import iso.std.iso_iec._24727.tech.schema.DSICreateResponse;
import iso.std.iso_iec._24727.tech.schema.DSIDelete;
import iso.std.iso_iec._24727.tech.schema.DSIDeleteResponse;
import iso.std.iso_iec._24727.tech.schema.DSIList;
import iso.std.iso_iec._24727.tech.schema.DSIListResponse;
import iso.std.iso_iec._24727.tech.schema.DSIRead;
import iso.std.iso_iec._24727.tech.schema.DSIReadResponse;
import iso.std.iso_iec._24727.tech.schema.DSIWrite;
import iso.std.iso_iec._24727.tech.schema.DSIWriteResponse;
import iso.std.iso_iec._24727.tech.schema.DataSetCreate;
import iso.std.iso_iec._24727.tech.schema.DataSetCreateResponse;
import iso.std.iso_iec._24727.tech.schema.DataSetDelete;
import iso.std.iso_iec._24727.tech.schema.DataSetDeleteResponse;
import iso.std.iso_iec._24727.tech.schema.DataSetList;
import iso.std.iso_iec._24727.tech.schema.DataSetListResponse;
import iso.std.iso_iec._24727.tech.schema.DataSetSelect;
import iso.std.iso_iec._24727.tech.schema.DataSetSelectResponse;
import iso.std.iso_iec._24727.tech.schema.Decipher;
import iso.std.iso_iec._24727.tech.schema.DecipherResponse;
import iso.std.iso_iec._24727.tech.schema.Encipher;
import iso.std.iso_iec._24727.tech.schema.EncipherResponse;
import iso.std.iso_iec._24727.tech.schema.EstablishContext;
import iso.std.iso_iec._24727.tech.schema.EstablishContextResponse;
import iso.std.iso_iec._24727.tech.schema.ExecuteAction;
import iso.std.iso_iec._24727.tech.schema.ExecuteActionResponse;
import iso.std.iso_iec._24727.tech.schema.GetRandom;
import iso.std.iso_iec._24727.tech.schema.GetRandomResponse;
import iso.std.iso_iec._24727.tech.schema.Hash;
import iso.std.iso_iec._24727.tech.schema.HashResponse;
import iso.std.iso_iec._24727.tech.schema.Initialize;
import iso.std.iso_iec._24727.tech.schema.InitializeResponse;
import iso.std.iso_iec._24727.tech.schema.ListIFDs;
import iso.std.iso_iec._24727.tech.schema.ListIFDsResponse;
import iso.std.iso_iec._24727.tech.schema.PathType;
import iso.std.iso_iec._24727.tech.schema.SecurityConditionType;
import iso.std.iso_iec._24727.tech.schema.Sign;
import iso.std.iso_iec._24727.tech.schema.SignResponse;
import iso.std.iso_iec._24727.tech.schema.TargetNameType;
import iso.std.iso_iec._24727.tech.schema.Terminate;
import iso.std.iso_iec._24727.tech.schema.TerminateResponse;
import iso.std.iso_iec._24727.tech.schema.VerifyCertificate;
import iso.std.iso_iec._24727.tech.schema.VerifyCertificateResponse;
import iso.std.iso_iec._24727.tech.schema.VerifySignature;
import iso.std.iso_iec._24727.tech.schema.VerifySignatureResponse;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.openecard.addon.AddonManager;
import org.openecard.bouncycastle.util.encoders.Hex;
import org.openecard.common.ClientEnv;
import org.openecard.common.ECardConstants;
import org.openecard.common.enums.EventType;
import org.openecard.common.interfaces.Dispatcher;
//import org.openecard.common.sal.anytype.PINCompareMarkerType;
//import org.openecard.sal.protocol.pincompare.anytype.PINCompareDIDAuthenticateInputType;
import org.openecard.common.interfaces.Environment;
import org.openecard.event.EventManager;
import org.openecard.common.sal.state.CardStateEntry;
import org.openecard.common.sal.state.CardStateMap;
import org.openecard.common.sal.state.SALStateCallback;
import org.openecard.common.util.ByteUtils;
import org.openecard.gui.UserConsent;
import org.openecard.gui.swing.SwingDialogWrapper;
import org.openecard.gui.swing.SwingUserConsent;
import org.openecard.ifd.scio.IFD;
import org.openecard.recognition.CardRecognition;
import org.openecard.transport.dispatcher.MessageDispatcher;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Johannes Schmölz <johannes.schmoelz@ecsec.de>
 * @author Dirk Petrautzki <petrautzki@hs-coburg.de>
 */
public class TinySALTest {

    //@BeforeClass
    //public static void disable() {
    //    throw new SkipException("Test completely disabled.");
    //}

    private static ClientEnv env;
    private static TinySAL instance;
    private static CardStateMap states;
    private static IFD ifd;
    private static Dispatcher dispatcher;
    private static EventManager eventManager;
//    private static CardApplicationPathResponse cardApplicationPathResponse;

    byte[] appIdentifier_ESIGN = Hex.decode("A000000167455349474E");
    byte[] appIdentifier_ROOT = Hex.decode("D2760001448000");
    byte[] appIdentifier_IRMA = Hex.decode("F849524D4163617264");

    @BeforeClass
    public static void setUp() throws Exception {
 	System.out.println("set up");

	env = new ClientEnv();
        IFD ifd = new IFD();
        states = new CardStateMap();
        dispatcher = new MessageDispatcher(env);

	env.setIFD(ifd);
        env.setDispatcher(dispatcher);

        instance = new TinySAL(env, states);
			
//	UserConsent uc = new SwingUserConsent(new SwingDialogWrapper());
//	eventManager = new EventManager(instance.getCardRecognition()cr, env, ecr.getContextHandle());
//	AddonManager manager = new AddonManager(dispatcher, uc, states, instance.getCardRecognition(), env);

/*	env = new ClientEnv();
	Dispatcher d = new MessageDispatcher(env);
	env.setDispatcher(d);
	IFD ifd = new IFD();
	ifd.setGUI(new SwingUserConsent(new SwingDialogWrapper()));
	env.setIFD(ifd);
	states = new CardStateMap();

	EstablishContextResponse ecr = env.getIFD().establishContext(new EstablishContext());
	CardRecognition cr = new CardRecognition(ifd, ecr.getContextHandle());
	ListIFDs listIFDs = new ListIFDs();

	listIFDs.setContextHandle(ecr.getContextHandle());
	ListIFDsResponse listIFDsResponse = ifd.listIFDs(listIFDs);
	RecognitionInfo recognitionInfo = cr.recognizeCard(listIFDsResponse.getIFDName().get(0), new BigInteger("0"));
	SALStateCallback salCallback = new SALStateCallback(cr, states);
	Connect c = new Connect();
	c.setContextHandle(ecr.getContextHandle());
	c.setIFDName(listIFDsResponse.getIFDName().get(0));
	c.setSlot(new BigInteger("0"));
	ConnectResponse connectResponse = env.getIFD().connect(c);

	ConnectionHandleType connectionHandleType = new ConnectionHandleType();
	connectionHandleType.setContextHandle(ecr.getContextHandle());
	connectionHandleType.setRecognitionInfo(recognitionInfo);
	connectionHandleType.setIFDName(listIFDsResponse.getIFDName().get(0));
	connectionHandleType.setSlotIndex(new BigInteger("0"));
	connectionHandleType.setSlotHandle(connectResponse.getSlotHandle());
	salCallback.signalEvent(EventType.CARD_RECOGNIZED, connectionHandleType);
	instance = new TinySAL(env, states);

	// init AddonManager
	UserConsent uc = new SwingUserConsent(new SwingDialogWrapper());
	
	eventManager = new EventManager(cr, env, ecr.getContextHandle());
	AddonManager manager = new AddonManager(d, uc, states, cr, eventManager);
	instance.setAddonManager(manager);
*/
    }

    @BeforeClass
    public static void setUpManager() throws Exception {
 	System.out.println("set up manager");

    	UserConsent uc = new SwingUserConsent(new SwingDialogWrapper());
	eventManager = new EventManager(instance.getCardRecognition(), env, instance.getContextHandle());
	AddonManager manager = new AddonManager(dispatcher, uc, states, instance.getCardRecognition(), eventManager);
	instance.setAddonManager(manager);
    }


    /**
     * Test of getConnectionHandles method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testGetConnectionHandles() {
	System.out.println("getConnectionHandles");
	List<ConnectionHandleType> cHandles = instance.getConnectionHandles();
	assertTrue(cHandles.isEmpty());
	String[] readers = { "Reader 1", "Reader 2" };
	ConnectionHandleType cHandle1 = new ConnectionHandleType();
	cHandle1.setIFDName(readers[0]);
	ConnectionHandleType cHandle2 = new ConnectionHandleType();
	cHandle2.setIFDName(readers[1]);
	// add connection handles to microSAL
	CardStateEntry entry1 = new CardStateEntry(cHandle1, null); // TODO: null works as long as
								    // there is no cif support
	states.addEntry(entry1);
	CardStateEntry entry2 = new CardStateEntry(cHandle2, null);
	states.addEntry(entry2);
	cHandles = instance.getConnectionHandles();
	assertTrue(cHandles.size() == 2);
	for (int i = 0; i < cHandles.size(); i++) {
	    assertEquals(readers[i], cHandles.get(i).getIFDName());
	}
	// remove one connection handle from microSAL
	states.removeEntry(cHandle1);
	cHandles = instance.getConnectionHandles();
	assertTrue(cHandles.size() == 1);
	assertEquals(cHandles.get(0).getIFDName(), readers[1]);
    }

    /**
     * Test card recognition.
     */
    @Test
    public void testRecognition() {
	System.out.println("card recognition");
	
	ListIFDsResponse result = instance.performRecognition();
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	instance.selectIFD(0, new BigInteger("0"));
    }


    /**
     * Test of initialize method, of class TinySAL.
     */
    @Test(priority = 1)
    public void testInitialize() {
	System.out.println("initialize");
	Initialize parameters = new Initialize();
	InitializeResponse result = instance.initialize(parameters);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());
    }

    /**
     * Test of terminate method, of class TinySAL.
     */
    @Test(priority = 200)
    public void testTerminate() {
	System.out.println("terminate");
	Terminate parameters = new Terminate();
	TerminateResponse result = instance.terminate(parameters);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());
    }

    /**
     * Test of cardApplicationPath method, of class TinySAL.
     */
    @Test(priority = 2)
    public void testCardApplicationPath() {
	System.out.println("cardApplicationPath");
	// test normal case
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(this.appIdentifier_IRMA);
	cardApplicationPathType.setContextHandle(instance.getContextHandle());
	cardApplicationPathType.setSlotIndex(new BigInteger("0"));
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);
		
	assertTrue(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().size() == 1);
	assertEquals(cardApplicationPathResponse.getResult().getResultMajor(), ECardConstants.Major.OK);

	// test return of alpha card application

/*	cardApplicationPath = new CardApplicationPath();
	cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	assertTrue(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().size()>0);
	assertNotNull(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().get(0).getCardApplication());
	assertEquals(cardApplicationPathResponse.getResult().getResultMajor(), ECardConstants.Major.OK);

	// test non existent card application identifier

	cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(Hex.decode("C0CA"));
	cardApplicationPathType.setContextHandle(instance.getContextHandle());
	cardApplicationPathType.setSlotIndex(new BigInteger("0"));
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	assertEquals(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().size(), 0);
	assertEquals(cardApplicationPathResponse.getResult().getResultMajor(), ECardConstants.Major.OK);

	// test nullpointer
	cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPath.setCardAppPathRequest(null);
	cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);
	assertEquals(cardApplicationPathResponse.getResult().getResultMajor(), ECardConstants.Major.ERROR);
	assertEquals(cardApplicationPathResponse.getResult().getResultMinor(), ECardConstants.Minor.App.INCORRECT_PARM);*/
    }

    /**
     * Test of cardApplicationConnect method, of class TinySAL.
     */
    @Test(priority = 3)
    public void testCardApplicationConnect() {
	System.out.println("cardApplicationConnect");
	// test normal case
	// get esign path
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_IRMA);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);
	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());
	assertEquals(appIdentifier_IRMA, result.getConnectionHandle().getCardApplication());

	// test non existent card application path
	//cardApplicationConnect = new CardApplicationConnect();
	//CardApplicationPathType wrongCardApplicationPath = cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().get(0);
	//wrongCardApplicationPath.setCardApplication(new byte[] { 0x12, 0x23, 0x34 });
	//cardApplicationConnect.setCardApplicationPath(wrongCardApplicationPath);
	//result = instance.cardApplicationConnect(cardApplicationConnect);
	//assertEquals(ECardConstants.Major.ERROR, result.getResult().getResultMajor());
	//assertEquals(ECardConstants.Minor.App.UNKNOWN_ERROR, result.getResult().getResultMinor());

	// test nullpointer
	//cardApplicationConnect = new CardApplicationConnect();
	//cardApplicationConnect.setCardApplicationPath(null);
	//result = instance.cardApplicationConnect(cardApplicationConnect);
	//assertEquals(ECardConstants.Major.ERROR, result.getResult().getResultMajor());
	//assertEquals(ECardConstants.Minor.App.INCORRECT_PARM, result.getResult().getResultMinor());
    }


    /**
     * Test of cardApplicationDisconnect method, of class TinySAL.
     */
    @Test(priority = 100)
    public void testCardApplicationDisconnect() {
	System.out.println("cardApplicationDisconnect");
	// test normal case
	// get esign path
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_IRMA);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);
	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(appIdentifier_IRMA, result.getConnectionHandle().getCardApplication());
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());
	// disconnect
	CardApplicationDisconnect cardApplicationDisconnect = new CardApplicationDisconnect();
	cardApplicationDisconnect.setConnectionHandle(result.getConnectionHandle());
	CardApplicationDisconnectResponse cardApplicationDisconnectResponse = instance.cardApplicationDisconnect(cardApplicationDisconnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	// test invalid connectionhandle
	// connect to esign
	/*cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().get(0));
	result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(appIdentifier_ESIGN, result.getConnectionHandle().getCardApplication());
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());
	// disconnect
	cardApplicationDisconnect = new CardApplicationDisconnect();
	cardApplicationDisconnect.setConnectionHandle(result.getConnectionHandle());
	cardApplicationDisconnect.getConnectionHandle().setSlotHandle(new byte[]{0x0, 0x0, 0x0});
	cardApplicationDisconnectResponse = instance.cardApplicationDisconnect(cardApplicationDisconnect);
	assertEquals(ECardConstants.Major.ERROR, cardApplicationDisconnectResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.IFD.INVALID_SLOT_HANDLE, cardApplicationDisconnectResponse.getResult().getResultMinor());

	// test nullpointer
	// connect to esign
	cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().get(0));
	result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(appIdentifier_ESIGN, result.getConnectionHandle().getCardApplication());
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());
	// disconnect
	cardApplicationDisconnect = new CardApplicationDisconnect();
	cardApplicationDisconnect.setConnectionHandle(null);
	cardApplicationDisconnectResponse = instance.cardApplicationDisconnect(cardApplicationDisconnect);
	assertEquals(ECardConstants.Major.ERROR, cardApplicationDisconnectResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.App.INCORRECT_PARM, cardApplicationDisconnectResponse.getResult().getResultMinor());*/
    }

    /**
     * Test of cardApplicationStartSession method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testCardApplicationStartSession() {
	System.out.println("cardApplicationStartSession");
	CardApplicationStartSession parameters = new CardApplicationStartSession();
	CardApplicationStartSessionResponse result = instance.cardApplicationStartSession(parameters);
	assertEquals(ECardConstants.Major.ERROR, result.getResult().getResultMajor());
    }

    /**
     * Test of cardApplicationEndSession method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testCardApplicationEndSession() {
	System.out.println("cardApplicationEndSession");
	CardApplicationEndSession parameters = new CardApplicationEndSession();
	CardApplicationEndSessionResponse result = instance.cardApplicationEndSession(parameters);
	assertEquals(ECardConstants.Major.ERROR, result.getResult().getResultMajor());
    }

    /**
     * Test of cardApplicationList method, of class TinySAL.
     */
    @Test(priority = 4)
    public void testCardApplicationList() {
	System.out.println("cardApplicationList");

	// get path to IRMA
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_IRMA);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to IRMA
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult()
		.get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	CardApplicationList cardApplicationList = new CardApplicationList();
	cardApplicationList.setConnectionHandle(result.getConnectionHandle());
	CardApplicationListResponse cardApplicationListResponse = instance.cardApplicationList(cardApplicationList);

	assertEquals(ECardConstants.Major.OK, cardApplicationListResponse.getResult().getResultMajor());
	assertTrue(cardApplicationListResponse.getCardApplicationNameList().getCardApplicationName().size() == 1);
	assertTrue(bytesToHex(cardApplicationListResponse.getCardApplicationNameList().getCardApplicationName().get(0)).equals("F849524D4163617264"));

	System.out.println("Applications #: " + cardApplicationListResponse.getCardApplicationNameList().getCardApplicationName().size());
	System.out.println("AID: " + bytesToHex(cardApplicationListResponse.getCardApplicationNameList().getCardApplicationName().get(0)));

	// test non existent connectionhandle
/*	cardApplicationList = new CardApplicationList();
	cardApplicationList.setConnectionHandle(result.getConnectionHandle());
	cardApplicationList.getConnectionHandle().setIFDName("invalid");
	cardApplicationListResponse = instance.cardApplicationList(cardApplicationList);
	assertEquals(ECardConstants.Major.ERROR, cardApplicationListResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.SAL.UNKNOWN_HANDLE, cardApplicationListResponse.getResult().getResultMinor());

	// test nullpointer
	cardApplicationList = new CardApplicationList();
	cardApplicationList.setConnectionHandle(null);
	cardApplicationListResponse = instance.cardApplicationList(cardApplicationList);
	assertEquals(ECardConstants.Major.ERROR, cardApplicationListResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.App.INCORRECT_PARM, cardApplicationListResponse.getResult().getResultMinor());
    */}

    /**
     * Test of cardApplicationCreate method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testCardApplicationCreate() {
	System.out.println("cardApplicationCreate");
	
	List<ConnectionHandleType> cHandles = instance.getConnectionHandles();
	byte[] appName = {(byte)0x74, (byte)0x65, (byte)0x73, (byte)0x74};
	
	CardApplicationCreate parameters = new CardApplicationCreate();
	parameters.setConnectionHandle(cHandles.get(0));
	parameters.setCardApplicationName(appName);

        AccessControlListType cardApplicationACL = new AccessControlListType();
	parameters.setCardApplicationACL(cardApplicationACL);
	
	CardApplicationCreateResponse result = instance.cardApplicationCreate(parameters);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	// get path to esign
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_ESIGN);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().get(0));
	CardApplicationConnectResponse resultConnect = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, resultConnect.getResult().getResultMajor());

	CardApplicationList cardApplicationList = new CardApplicationList();
	cardApplicationList.setConnectionHandle(cHandles.get(0));
	CardApplicationListResponse cardApplicationListResponse = instance.cardApplicationList(cardApplicationList);

        Iterator<byte[]> it = cardApplicationListResponse.getCardApplicationNameList().getCardApplicationName().iterator();
        boolean appFound = false;

        try {
            while (it.hasNext()) {
                byte[] val = it.next();

                if (Arrays.equals(val, appName))
                    appFound = true;
            }

            assertTrue(appFound);
    
	} catch (Exception e) {
	    assertTrue(appFound);
	    System.out.println(e);
        } 
    }

    /**
     * Test of cardApplicationDelete method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testCardApplicationDelete() {
	System.out.println("cardApplicationDelete");

	List<ConnectionHandleType> cHandles = instance.getConnectionHandles();
	byte[] appName = {(byte)0x74, (byte)0x65, (byte)0x73, (byte)0x74};
	
	CardApplicationDelete parameters = new CardApplicationDelete();
	parameters.setConnectionHandle(cHandles.get(0));
	parameters.setCardApplicationName(appName);
    	
	CardApplicationDeleteResponse result = instance.cardApplicationDelete(parameters);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	// get path to esign
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_ESIGN);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().get(0));
	CardApplicationConnectResponse resultConnect = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, resultConnect.getResult().getResultMajor());

	CardApplicationList cardApplicationList = new CardApplicationList();
	cardApplicationList.setConnectionHandle(cHandles.get(0));
	CardApplicationListResponse cardApplicationListResponse = instance.cardApplicationList(cardApplicationList);

        Iterator<byte[]> it = cardApplicationListResponse.getCardApplicationNameList().getCardApplicationName().iterator();
        boolean appFound = false;

        try {
            while (it.hasNext()) {
                byte[] val = it.next();

                if (Arrays.equals(val, appName))
                    appFound = true;
            }

            assertTrue(!appFound);
    
	} catch (Exception e) {
	    assertTrue(!appFound);
	    System.out.println(e);
        } 
    }

    /**
     * Test of cardApplicationServiceList method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testCardApplicationServiceList() {
	System.out.println("cardApplicationServiceList");
	CardApplicationServiceList parameters = new CardApplicationServiceList();
	
        // get path to esign
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_ESIGN);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);
	
	assertTrue(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().size() > 0);
	assertEquals(cardApplicationPathResponse.getResult().getResultMajor(), ECardConstants.Major.OK);

	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().get(0));
	
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());
	assertEquals(appIdentifier_ESIGN, result.getConnectionHandle().getCardApplication());

	parameters.setConnectionHandle(result.getConnectionHandle());
	
	CardApplicationServiceListResponse resultServiceList = instance.cardApplicationServiceList(parameters);
        CardApplicationServiceNameList cardApplicationServiceNameList = resultServiceList.getCardApplicationServiceNameList();

	assertEquals(ECardConstants.Major.OK, resultServiceList.getResult().getResultMajor());
	assertTrue(cardApplicationServiceNameList.getCardApplicationServiceName().size() == 0); 
    }
    
    /**
     * Test of cardApplicationServiceCreate method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testCardApplicationServiceCreate() {
	System.out.println("cardApplicationServiceCreate");	
	CardApplicationServiceCreate parameters = new CardApplicationServiceCreate();
	
        // get path to esign
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_ESIGN);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);
	
	assertTrue(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().size() > 0);
	assertEquals(cardApplicationPathResponse.getResult().getResultMajor(), ECardConstants.Major.OK);

	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().get(0));
	
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());
	assertEquals(appIdentifier_ESIGN, result.getConnectionHandle().getCardApplication());

	parameters.setConnectionHandle(result.getConnectionHandle());
	parameters.setCardApplicationServiceName("testService");
	
	CardApplicationServiceCreateResponse resultServiceCreate = instance.cardApplicationServiceCreate(parameters);
	assertEquals(ECardConstants.Major.OK, resultServiceCreate.getResult().getResultMajor());

	CardApplicationServiceList parametersServiceList = new CardApplicationServiceList();
	parametersServiceList.setConnectionHandle(result.getConnectionHandle());
	
	CardApplicationServiceListResponse resultServiceList = instance.cardApplicationServiceList(parametersServiceList);
        CardApplicationServiceNameList cardApplicationServiceNameList = resultServiceList.getCardApplicationServiceNameList();

	assertEquals(ECardConstants.Major.OK, resultServiceList.getResult().getResultMajor());
	assertTrue(cardApplicationServiceNameList.getCardApplicationServiceName().size() > 0); 
    }

    /**
     * Test of cardApplicationServiceLoad method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testCardApplicationServiceLoad() {
	System.out.println("cardApplicationServiceLoad");
	CardApplicationServiceLoad parameters = new CardApplicationServiceLoad();
	CardApplicationServiceLoadResponse result = instance.cardApplicationServiceLoad(parameters);
	assertEquals(ECardConstants.Major.ERROR, result.getResult().getResultMajor());
    }

    /**
     * Test of cardApplicationServiceDelete method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testCardApplicationServiceDelete() {
	System.out.println("cardApplicationServiceDelete");

	CardApplicationServiceDelete parameters = new CardApplicationServiceDelete();
	
        // get path to esign
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_ESIGN);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);
	
	assertTrue(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().size() > 0);
	assertEquals(cardApplicationPathResponse.getResult().getResultMajor(), ECardConstants.Major.OK);

	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().get(0));
	
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());
	assertEquals(appIdentifier_ESIGN, result.getConnectionHandle().getCardApplication());

	parameters.setConnectionHandle(result.getConnectionHandle());
	parameters.setCardApplicationServiceName("testService");
	
	CardApplicationServiceDeleteResponse resultServiceDelete = instance.cardApplicationServiceDelete(parameters);
	assertEquals(ECardConstants.Major.OK, resultServiceDelete.getResult().getResultMajor());

	CardApplicationServiceList parametersServiceList = new CardApplicationServiceList();
	parametersServiceList.setConnectionHandle(result.getConnectionHandle());
	
	CardApplicationServiceListResponse resultServiceList = instance.cardApplicationServiceList(parametersServiceList);
        CardApplicationServiceNameList cardApplicationServiceNameList = resultServiceList.getCardApplicationServiceNameList();

	assertEquals(ECardConstants.Major.OK, resultServiceList.getResult().getResultMajor());
	assertTrue(cardApplicationServiceNameList.getCardApplicationServiceName().size() == 0); 

    }

    /**
     * Test of cardApplicationServiceDescribe method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testCardApplicationServiceDescribe() {
	System.out.println("cardApplicationServiceDescribe");
	CardApplicationServiceDescribe parameters = new CardApplicationServiceDescribe();

        // get path to esign
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_ESIGN);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);
	
	assertTrue(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().size() > 0);
	assertEquals(cardApplicationPathResponse.getResult().getResultMajor(), ECardConstants.Major.OK);

	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().get(0));
	
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());
	assertEquals(appIdentifier_ESIGN, result.getConnectionHandle().getCardApplication());

	parameters.setConnectionHandle(result.getConnectionHandle());
	parameters.setCardApplicationServiceName("testService"); 
	
	CardApplicationServiceDescribeResponse resultServiceDescribe = instance.cardApplicationServiceDescribe(parameters);
	assertEquals(ECardConstants.Major.OK, resultServiceDescribe.getResult().getResultMajor());
    }

    /**
     * Test of executeAction method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testExecuteAction() {
	System.out.println("executeAction");
	ExecuteAction parameters = new ExecuteAction();
	ExecuteActionResponse result = instance.executeAction(parameters);
	assertEquals(ECardConstants.Major.ERROR, result.getResult().getResultMajor());
    }

    /**
     * Test of dataSetList method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testDataSetList() {
	System.out.println("dataSetList");

	// get path to esign
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_ESIGN);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult()
		.get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	// list datasets of esign
	DataSetList dataSetList = new DataSetList();
	dataSetList.setConnectionHandle(result.getConnectionHandle());
	DataSetListResponse dataSetListResponse = instance.dataSetList(dataSetList);
	System.out.println(ByteUtils.toHexString(result.getConnectionHandle().getSlotHandle()));
	Assert.assertTrue(dataSetListResponse.getDataSetNameList().getDataSetName().size() > 0);
	assertEquals(ECardConstants.Major.OK, dataSetListResponse.getResult().getResultMajor());

	// test invalid connectionhandle
	dataSetList = new DataSetList();
	ConnectionHandleType wrongConnectionHandle = result.getConnectionHandle();
	wrongConnectionHandle.setCardApplication(new byte[] { 0x0, 0x0, 0x0 });
	dataSetList.setConnectionHandle(wrongConnectionHandle);
	dataSetListResponse = instance.dataSetList(dataSetList);
	assertEquals(ECardConstants.Major.ERROR, dataSetListResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.App.UNKNOWN_ERROR, dataSetListResponse.getResult().getResultMinor());

	// test null connectionhandle
	dataSetList = new DataSetList();
	dataSetList.setConnectionHandle(null);
	dataSetListResponse = instance.dataSetList(dataSetList);
	assertEquals(ECardConstants.Major.ERROR, dataSetListResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.App.INCORRECT_PARM, dataSetListResponse.getResult().getResultMinor());

	// TODO test for unsatisfied security condition
    }

    /**
     * Test of dataSetCreate method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testDataSetCreate() {
	System.out.println("dataSetCreate");
	
	DataSetCreate parameters = new DataSetCreate();

	// get path to esign
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_ESIGN);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult()
		.get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

        AccessControlListType accessControlList = new AccessControlListType();

	parameters.setConnectionHandle(result.getConnectionHandle());

	String dataSetName = "DataSetTest";
	parameters.setDataSetName(dataSetName);
	parameters.setDataSetACL(accessControlList);

	DataSetCreateResponse resultDataSetCreate = instance.dataSetCreate(parameters);
	assertEquals(ECardConstants.Major.OK, resultDataSetCreate.getResult().getResultMajor());
	
	// list datasets of esign
	DataSetList dataSetList = new DataSetList();
	dataSetList.setConnectionHandle(result.getConnectionHandle());
	DataSetListResponse dataSetListResponse = instance.dataSetList(dataSetList);
		
        Iterator<String> it = dataSetListResponse.getDataSetNameList().getDataSetName().iterator();
        boolean dataSetFound = false;

        while (it.hasNext()) {
                String val = it.next();

                if (val.equals(dataSetName))
                    dataSetFound = true;

        }
        
        assertTrue(dataSetFound);
	assertEquals(ECardConstants.Major.OK, dataSetListResponse.getResult().getResultMajor());	
    }

    /**
     * Test of dataSetSelect method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testDataSetSelect() {
	System.out.println("dataSetSelect");
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_ESIGN);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	CardApplicationConnect parameters = new CardApplicationConnect();
	parameters.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(parameters);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	// test good case
	DataSetSelect dataSetSelect = new DataSetSelect();
	dataSetSelect.setConnectionHandle(result.getConnectionHandle());
	dataSetSelect.setDataSetName("EF.C.CH.AUT");
	DataSetSelectResponse dataSetSelectResponse = instance.dataSetSelect(dataSetSelect);
	assertEquals(ECardConstants.Major.OK, dataSetSelectResponse.getResult().getResultMajor());

	// test connectionhanle == null
	dataSetSelect = new DataSetSelect();
	dataSetSelect.setConnectionHandle(null);
	dataSetSelect.setDataSetName("EF.C.CH.AUT");
	dataSetSelectResponse = instance.dataSetSelect(dataSetSelect);
	assertEquals(ECardConstants.Major.ERROR, dataSetSelectResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.App.INCORRECT_PARM, dataSetSelectResponse.getResult().getResultMinor());
	// test datasetname == null
	dataSetSelect = new DataSetSelect();
	dataSetSelect.setConnectionHandle(result.getConnectionHandle());
	dataSetSelect.setDataSetName(null);
	dataSetSelectResponse = instance.dataSetSelect(dataSetSelect);
	assertEquals(ECardConstants.Major.ERROR, dataSetSelectResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.App.INCORRECT_PARM, dataSetSelectResponse.getResult().getResultMinor());
	// test datasetname not found
	dataSetSelect = new DataSetSelect();
	dataSetSelect.setConnectionHandle(result.getConnectionHandle());
	dataSetSelect.setDataSetName("INVALID");
	dataSetSelectResponse = instance.dataSetSelect(dataSetSelect);
	assertEquals(ECardConstants.Major.ERROR, dataSetSelectResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.SAL.NAMED_ENTITY_NOT_FOUND, dataSetSelectResponse.getResult().getResultMinor());
	// test invalid connectionhandle
	dataSetSelect = new DataSetSelect();
	ConnectionHandleType invalidConnectionHandle = result.getConnectionHandle();
	invalidConnectionHandle.setIFDName(("invalid"));
	dataSetSelect.setConnectionHandle(invalidConnectionHandle);
	dataSetSelect.setDataSetName("EF.C.CH.AUT");
	dataSetSelectResponse = instance.dataSetSelect(dataSetSelect);
	assertEquals(ECardConstants.Major.ERROR, dataSetSelectResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.SAL.UNKNOWN_HANDLE, dataSetSelectResponse.getResult().getResultMinor());
    }

    /**
     * Test of dataSetDelete method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testDataSetDelete() {
	System.out.println("dataSetDelete");
	
	DataSetDelete parameters = new DataSetDelete();

	// get path to esign
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_ESIGN);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult()
		.get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	parameters.setConnectionHandle(result.getConnectionHandle());

	String dataSetName = "DataSetTest";
	parameters.setDataSetName(dataSetName);

	DataSetDeleteResponse resultDataSetDelete = instance.dataSetDelete(parameters);
	assertEquals(ECardConstants.Major.OK, resultDataSetDelete.getResult().getResultMajor());
	
	// list datasets of esign
	DataSetList dataSetList = new DataSetList();
	dataSetList.setConnectionHandle(result.getConnectionHandle());
	DataSetListResponse dataSetListResponse = instance.dataSetList(dataSetList);
		
        Iterator<String> it = dataSetListResponse.getDataSetNameList().getDataSetName().iterator();
        boolean dataSetFound = false;

        while (it.hasNext()) {
                String val = it.next();

                if (val.equals(dataSetName))
                    dataSetFound = true;

        }
        
        assertTrue(!dataSetFound);
	assertEquals(ECardConstants.Major.OK, dataSetListResponse.getResult().getResultMajor());	
    }

    /**
     * Test of dsiList method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testDsiList() {
	System.out.println("dsiList");
	
	// get path to esign
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_ESIGN);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult()
		.get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	// list datasets of esign
	DataSetList dataSetList = new DataSetList();
	dataSetList.setConnectionHandle(result.getConnectionHandle());
	DataSetListResponse dataSetListResponse = instance.dataSetList(dataSetList);

	Assert.assertTrue(dataSetListResponse.getDataSetNameList().getDataSetName().size() > 0);
	assertEquals(ECardConstants.Major.OK, dataSetListResponse.getResult().getResultMajor());
	
        String dataSetName = dataSetListResponse.getDataSetNameList().getDataSetName().get(0);
		
	DSIList parameters = new DSIList();
	parameters.setDataSetName(dataSetName);
	parameters.setConnectionHandle(result.getConnectionHandle());
	
	DSIListResponse resultDSIList = instance.dsiList(parameters);
	assertEquals(ECardConstants.Major.OK, resultDSIList.getResult().getResultMajor());
	assertTrue(resultDSIList.getDSINameList().getDSIName().size() == 0);
    }

    /**
     * Test of dsiCreate method, of class TinySAL.
     */
    @Test(enabled = false)
    public void testDsiCreate() {
	System.out.println("dsiCreate");

	// get path to esign
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_ESIGN);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult()
		.get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	// list datasets of esign
	DataSetList dataSetList = new DataSetList();
	dataSetList.setConnectionHandle(result.getConnectionHandle());
	DataSetListResponse dataSetListResponse = instance.dataSetList(dataSetList);

	Assert.assertTrue(dataSetListResponse.getDataSetNameList().getDataSetName().size() > 0);
	assertEquals(ECardConstants.Major.OK, dataSetListResponse.getResult().getResultMajor());
	
        String dataSetName = dataSetListResponse.getDataSetNameList().getDataSetName().get(0);
        byte[] dsiContent = {(byte)0x74, (byte)0x65, (byte)0x73, (byte)0x74};
        String dsiName = "DsiTest";
        PathType dsiPath = new PathType();
        byte[] dsiEF = {(byte)0x03, (byte)0x00};
        dsiPath.setEfIdOrPath(dsiEF);

	DSICreate parameters = new DSICreate();	
	parameters.setConnectionHandle(result.getConnectionHandle());
	parameters.setDataSetName(dataSetName);
	parameters.setDSIContent(dsiContent);
	parameters.setDSIName(dsiName);
	parameters.setDSIPath(dsiPath);
	
	DSICreateResponse resultDSICreate = instance.dsiCreate(parameters);
	assertEquals(ECardConstants.Major.OK, resultDSICreate.getResult().getResultMajor());

	// list DSIs of DataSetName

	DSIList parametersDSI = new DSIList();
	parametersDSI.setDataSetName(dataSetName);
	parametersDSI.setConnectionHandle(result.getConnectionHandle());
	
	DSIListResponse resultDSIList = instance.dsiList(parametersDSI);
	assertEquals(ECardConstants.Major.OK, resultDSIList.getResult().getResultMajor());

	// try to find new DSI

        Iterator<String> it = resultDSIList.getDSINameList().getDSIName().iterator();
        boolean dsiFound = false;

        while (it.hasNext()) {
                String val = it.next();

                if (val.equals(dsiName))
                    dsiFound = true;

        }
        
        assertTrue(dsiFound);
    }

    /**
     * Test of dsiDelete method, of class TinySAL.
     */
    @Test(enabled = false)
    public void testDsiDelete() {
	System.out.println("dsiDelete");

	// get path to esign
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_ESIGN);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult()
		.get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	// list datasets of esign
	DataSetList dataSetList = new DataSetList();
	dataSetList.setConnectionHandle(result.getConnectionHandle());
	DataSetListResponse dataSetListResponse = instance.dataSetList(dataSetList);

	Assert.assertTrue(dataSetListResponse.getDataSetNameList().getDataSetName().size() > 0);
	assertEquals(ECardConstants.Major.OK, dataSetListResponse.getResult().getResultMajor());
	
        String dataSetName = dataSetListResponse.getDataSetNameList().getDataSetName().get(0);
        String dsiName = "dsiTest";

	DSIDelete parameters = new DSIDelete();
	parameters.setConnectionHandle(result.getConnectionHandle());
	parameters.setDataSetName(dataSetName);
	parameters.setDSIName(dsiName);

	DSIDeleteResponse resultDSIDelete = instance.dsiDelete(parameters);
	assertEquals(ECardConstants.Major.OK, resultDSIDelete.getResult().getResultMajor());

	// try to find dsiName under dataSetName

	DSIList parametersDSI = new DSIList();
	parametersDSI.setDataSetName("EF.C.ICC.QES");
	parametersDSI.setConnectionHandle(result.getConnectionHandle());
	
	DSIListResponse resultDSIList = instance.dsiList(parametersDSI);
	assertEquals(ECardConstants.Major.OK, resultDSIList.getResult().getResultMajor());

	// try to find new DSI

        Iterator<String> it = resultDSIList.getDSINameList().getDSIName().iterator();
        boolean dsiFound = false;

        while (it.hasNext()) {
                String val = it.next();

                if (val.equals(dsiName))
                    dsiFound = true;

        }
        
        assertTrue(!dsiFound);
    }

    /**
     * Test of dsiWrite method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testDsiWrite() {
	System.out.println("dsiWrite");
	DSIWrite parameters = new DSIWrite();
	DSIWriteResponse result = instance.dsiWrite(parameters);
	assertEquals(ECardConstants.Major.ERROR, result.getResult().getResultMajor());
    }

    /**
     * Test of dsiRead method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testDsiRead() {
	System.out.println("dsiRead");
	// test normal case
	// get esign path
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_ESIGN);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);
	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult().get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());
	assertEquals(appIdentifier_ESIGN, result.getConnectionHandle().getCardApplication());


	// read EF.C.CH.AUT
	DSIRead dsiRead = new DSIRead();
	dsiRead.setConnectionHandle(result.getConnectionHandle());
	dsiRead.setDSIName("EF.C.CH.AUT");
	DSIReadResponse dsiReadResponse = instance.dsiRead(dsiRead);
	System.out.println(dsiReadResponse.getResult().getResultMinor());
	assertEquals(ECardConstants.Major.OK, dsiReadResponse.getResult().getResultMajor());
	System.out.println(dsiReadResponse.getResult().getResultMinor());
	assertTrue(dsiReadResponse.getDSIContent().length>0);

	// test connectionhandle == null
	dsiRead = new DSIRead();
	dsiRead.setConnectionHandle(null);
	dsiRead.setDSIName("EF.C.CH.AUT");
	dsiReadResponse = instance.dsiRead(dsiRead);
	assertEquals(ECardConstants.Major.ERROR, dsiReadResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.App.INCORRECT_PARM, dsiReadResponse.getResult().getResultMinor());

	// test dsiName == null
	dsiRead = new DSIRead();
	dsiRead.setConnectionHandle(result.getConnectionHandle());
	dsiRead.setDSIName(null);
	dsiReadResponse = instance.dsiRead(dsiRead);
	assertEquals(ECardConstants.Major.ERROR, dsiReadResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.App.INCORRECT_PARM, dsiReadResponse.getResult().getResultMinor());

	// test dsiName invalid
	dsiRead = new DSIRead();
	dsiRead.setConnectionHandle(result.getConnectionHandle());
	dsiRead.setDSIName("INVALID");
	dsiReadResponse = instance.dsiRead(dsiRead);
	assertEquals(ECardConstants.Major.ERROR, dsiReadResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.SAL.NAMED_ENTITY_NOT_FOUND, dsiReadResponse.getResult().getResultMinor());

	// test security condition not satisfied
	dsiRead = new DSIRead();
	dsiRead.setConnectionHandle(result.getConnectionHandle());
	dsiRead.setDSIName("EF.C.CH.AUTN");
	dsiReadResponse = instance.dsiRead(dsiRead);
	assertEquals(ECardConstants.Major.ERROR, dsiReadResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.SAL.SECURITY_CONDITINON_NOT_SATISFIED, dsiReadResponse.getResult().getResultMinor());

	// test invalid connectionhandle
	dsiRead = new DSIRead();
	dsiRead.setConnectionHandle(result.getConnectionHandle());
	dsiRead.getConnectionHandle().setIFDName("invalid");
	dsiRead.setDSIName(null);
	dsiReadResponse = instance.dsiRead(dsiRead);
	assertEquals(ECardConstants.Major.ERROR, dsiReadResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.SAL.UNKNOWN_HANDLE, dsiReadResponse.getResult().getResultMinor());
    }

    /**
     * Test of encipher method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testEncipher() {
	System.out.println("encipher");
	Encipher parameters = new Encipher();
	EncipherResponse result = instance.encipher(parameters);
	assertEquals(ECardConstants.Major.ERROR, result.getResult().getResultMajor());
    }

    /**
     * Test of decipher method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testDecipher() {
	System.out.println("decipher");
	Decipher parameters = new Decipher();
	DecipherResponse result = instance.decipher(parameters);
	assertEquals(ECardConstants.Major.ERROR, result.getResult().getResultMajor());
    }

    /**
     * Test of getRandom method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testGetRandom() {
	System.out.println("getRandom");
	GetRandom parameters = new GetRandom();
	GetRandomResponse result = instance.getRandom(parameters);
	assertEquals(ECardConstants.Major.ERROR, result.getResult().getResultMajor());
    }

    /**
     * Test of hash method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testHash() {
	System.out.println("hash");
	Hash parameters = new Hash();
	HashResponse result = instance.hash(parameters);
	assertEquals(ECardConstants.Major.ERROR, result.getResult().getResultMajor());
    }

    /**
     * Test of sign method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testSign() {
	System.out.println("sign");
	Sign parameters = new Sign();
	SignResponse result = instance.sign(parameters);
	assertEquals(ECardConstants.Major.ERROR, result.getResult().getResultMajor());
    }

    /**
     * Test of verifySignature method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testVerifySignature() {
	System.out.println("verifySignature");
	VerifySignature parameters = new VerifySignature();
	VerifySignatureResponse result = instance.verifySignature(parameters);
	assertEquals(ECardConstants.Major.ERROR, result.getResult().getResultMajor());
    }

    /**
     * Test of verifyCertificate method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testVerifyCertificate() {
	System.out.println("verifyCertificate");
	VerifyCertificate parameters = new VerifyCertificate();
	VerifyCertificateResponse result = instance.verifyCertificate(parameters);
	assertEquals(ECardConstants.Major.ERROR, result.getResult().getResultMajor());
    }

    /**
     * Test of didList method, of class TinySAL.
     */

    @Test(priority = 5)
    public void testDidList() {
	System.out.println("didList");

	// get path to IRMA
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_IRMA);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to IRMA
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult()
		.get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	DIDList didList = new DIDList();
	didList.setConnectionHandle(result.getConnectionHandle());
	DIDQualifierType didQualifier = new DIDQualifierType();
	didQualifier.setApplicationIdentifier(appIdentifier_IRMA);
	//didQualifier.setObjectIdentifier("urn:oid:1.3.162.15480.3.0.25");
	//didQualifier.setApplicationFunction("Compute-signature");
	didList.setFilter(didQualifier);
	DIDListResponse didListResponse = instance.didList(didList);

	Assert.assertTrue(didListResponse.getDIDNameList().getDIDName().size() > 0);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	System.out.println("Numero de DIDs: " + didListResponse.getDIDNameList().getDIDName().size());
	
	for(Iterator<String> i =  didListResponse.getDIDNameList().getDIDName().iterator(); i.hasNext(); ) {
	    String item = i.next();
            System.out.println(item);
        }
	
	// get path to root
	//cardApplicationPath = new CardApplicationPath();
	//cardApplicationPathType = new CardApplicationPathType();
	//cardApplicationPathType.setCardApplication(appIdentifier_ROOT);
	//cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	//cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to root
	//cardApplicationConnect = new CardApplicationConnect();
	//cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult()
	//	.get(0));
	//cardApplicationConnect.getCardApplicationPath().setCardApplication(appIdentifier_ROOT);
	//result = instance.cardApplicationConnect(cardApplicationConnect);
	//assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	//didList = new DIDList();
	//didList.setConnectionHandle(result.getConnectionHandle());
	//didQualifier = new DIDQualifierType();
	//didQualifier.setApplicationIdentifier(appIdentifier_ROOT);
	//didQualifier.setObjectIdentifier("urn:oid:1.3.162.15480.3.0.25");
	//didQualifier.setApplicationFunction("Compute-signature");
	//didList.setFilter(didQualifier);
	//didListResponse = instance.didList(didList);

	// we expect 0 because of the filter
	//Assert.assertEquals(didListResponse.getDIDNameList().getDIDName().size(), 0);
	//assertEquals(ECardConstants.Major.OK, didListResponse.getResult().getResultMajor());

	// test null connectionhandle
	//didList = new DIDList();
	//didList.setConnectionHandle(null);
	//didListResponse = instance.didList(didList);
	//assertEquals(ECardConstants.Major.ERROR, didListResponse.getResult().getResultMajor());
	//assertEquals(ECardConstants.Minor.App.INCORRECT_PARM, didListResponse.getResult().getResultMinor());

	//test invalid connectionhandle
	//didList = new DIDList();
	//didList.setConnectionHandle(result.getConnectionHandle());
	//didList.getConnectionHandle().setIFDName("invalid");
	//didListResponse = instance.didList(didList);
	//assertEquals(ECardConstants.Major.ERROR, didListResponse.getResult().getResultMajor());
	//assertEquals(ECardConstants.Minor.SAL.UNKNOWN_HANDLE, didListResponse.getResult().getResultMinor());
    }

    /**
     * Test of didCreate method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testDidCreate() {
	System.out.println("didCreate");
	DIDCreate parameters = new DIDCreate();
	DIDCreateResponse result = instance.didCreate(parameters);
	assertEquals(ECardConstants.Major.ERROR, result.getResult().getResultMajor());
    }

    /**
     * Test of didGet method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testDidGet() {
	System.out.println("didGet");

	// get path to esign
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_ESIGN);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult()
		.get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	DIDList didList = new DIDList();
	didList.setConnectionHandle(result.getConnectionHandle());
	DIDQualifierType didQualifier = new DIDQualifierType();
	didQualifier.setApplicationIdentifier(appIdentifier_ESIGN);
	didQualifier.setObjectIdentifier("urn:oid:1.3.162.15480.3.0.25");
	didQualifier.setApplicationFunction("Compute-signature");
	didList.setFilter(didQualifier);

	DIDListResponse didListResponse = instance.didList(didList);

	Assert.assertTrue(didListResponse.getDIDNameList().getDIDName().size() > 0);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

        String didName = didListResponse.getDIDNameList().getDIDName().get(0);
	
	DIDGet parameters = new DIDGet();
	parameters.setDIDName(didName);
	parameters.setConnectionHandle(result.getConnectionHandle());
	
	DIDGetResponse resultDIDGet = instance.didGet(parameters);
	assertEquals(ECardConstants.Major.OK, resultDIDGet.getResult().getResultMajor());
	assertTrue(resultDIDGet.getDIDStructure() != null);
    }

    /**
     * Test of didDelete method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testDidDelete() {
	System.out.println("didDelete");
	DIDDelete parameters = new DIDDelete();
	DIDDeleteResponse result = instance.didDelete(parameters);
	assertEquals(ECardConstants.Major.ERROR, result.getResult().getResultMajor());
    }

    /**
     * Test of didAuthenticate method, of class TinySAL.
     *
     * @throws ParserConfigurationException
     */
    @Test(priority = 6) // 6
    public void testDidAuthenticate1() throws ParserConfigurationException {
	System.out.println("didAuthenticate, PIN ATTRIBUTE");

	// get path to IRMA
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_IRMA);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to IRMA
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult()
		.get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);

	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	DIDAuthenticate parameters = new DIDAuthenticate();
	parameters.setDIDName("PIN.ATTRIBUTE");
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	factory.setNamespaceAware(true);
	DocumentBuilder builder = factory.newDocumentBuilder();
	Document d = builder.newDocument();
	Element elemPin = d.createElementNS("urn:iso:std:iso-iec:24727:tech:schema", "Pin");
	elemPin.setTextContent("0000");
	DIDAuthenticationDataType didAuthenticationData = new DIDAuthenticationDataType();
	didAuthenticationData.getAny().add(elemPin);

	//PINCompareDIDAuthenticateInputType pinCompareDIDAuthenticateInputType = new PINCompareDIDAuthenticateInputType(
	//	didAuthenticationData);

	parameters.setAuthenticationProtocolData(didAuthenticationData);
	parameters.setConnectionHandle(result.getConnectionHandle());
	didAuthenticationData.setProtocol(ECardConstants.Protocol.PIN_COMPARE);
	parameters.setAuthenticationProtocolData(didAuthenticationData);
	DIDAuthenticateResponse result1 = instance.didAuthenticate(parameters);

	assertEquals(result1.getAuthenticationProtocolData().getProtocol(), ECardConstants.Protocol.PIN_COMPARE);
	assertEquals(ECardConstants.Major.OK, result1.getResult().getResultMajor());
	assertEquals(result1.getAuthenticationProtocolData().getAny().size(), 0);
    }

    /**
     * Test of didUpdate method, of class TinySAL.
     */
    @Test(priority = 7) //7
    public void testDidUpdate1() throws ParserConfigurationException {
	System.out.println("didUpdate, PIN ATTRIBUTE, change PIN from 0000 to 1111");

	// get path to IRMA
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_IRMA);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to IRMA
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult()
		.get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);

	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

        DIDUpdate parameters = new DIDUpdate();
	parameters.setDIDName("PIN.ATTRIBUTE");
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	factory.setNamespaceAware(true);
	DocumentBuilder builder = factory.newDocumentBuilder();
	Document d = builder.newDocument();

	Element elemPin = d.createElementNS("urn:iso:std:iso-iec:24727:tech:schema", "Pin");
	elemPin.setTextContent("1111");
	
	Element elemOldPin = d.createElementNS("urn:iso:std:iso-iec:24727:tech:schema", "OldPin");
	elemOldPin.setTextContent("0000");

	Element elemAdminPin = d.createElementNS("urn:iso:std:iso-iec:24727:tech:schema", "AdminPin");
	elemAdminPin.setTextContent("000000");

	DIDUpdateDataType didUpdateData = new DIDUpdateDataType();

	didUpdateData.getAny().add(elemPin);
	didUpdateData.getAny().add(elemOldPin);
	didUpdateData.getAny().add(elemAdminPin);

	didUpdateData.setProtocol(ECardConstants.Protocol.PIN_COMPARE);
	parameters.setConnectionHandle(result.getConnectionHandle());
 	parameters.setDIDUpdateData(didUpdateData);

	DIDUpdateResponse result1 = instance.didUpdate(parameters);
	assertEquals(ECardConstants.Major.OK, result1.getResult().getResultMajor());

	// check PIN 1111

	System.out.println("didAuthenticate, PIN ATTRIBUTE, check PIN 1111");

	DIDAuthenticate parameters1 = new DIDAuthenticate();
	parameters1.setDIDName("PIN.ATTRIBUTE");
	DocumentBuilderFactory factory1 = DocumentBuilderFactory.newInstance();
	factory1.setNamespaceAware(true);
	DocumentBuilder builder1 = factory.newDocumentBuilder();
	Document d1 = builder1.newDocument();
	Element elemPin1 = d1.createElementNS("urn:iso:std:iso-iec:24727:tech:schema", "Pin");
	elemPin1.setTextContent("1111");
	DIDAuthenticationDataType didAuthenticationData = new DIDAuthenticationDataType();
	didAuthenticationData.getAny().add(elemPin1);

	parameters1.setAuthenticationProtocolData(didAuthenticationData);
	parameters1.setConnectionHandle(result.getConnectionHandle());
	didAuthenticationData.setProtocol(ECardConstants.Protocol.PIN_COMPARE);
	parameters1.setAuthenticationProtocolData(didAuthenticationData);
	DIDAuthenticateResponse result2 = instance.didAuthenticate(parameters1);

	assertEquals(result2.getAuthenticationProtocolData().getProtocol(), ECardConstants.Protocol.PIN_COMPARE);
	assertEquals(ECardConstants.Major.OK, result2.getResult().getResultMajor());
	assertEquals(result2.getAuthenticationProtocolData().getAny().size(), 0);

	// change again to 0000

	System.out.println("didUpdate, PIN ATTRIBUTE, initiliaze PIN to 0000");

        DIDUpdate parameters4 = new DIDUpdate();
	parameters4.setDIDName("PIN.ATTRIBUTE");
	DocumentBuilderFactory factory4 = DocumentBuilderFactory.newInstance();
	factory4.setNamespaceAware(true);
	DocumentBuilder builder4 = factory4.newDocumentBuilder();
	Document d4 = builder4.newDocument();

	Element elemPin4 = d4.createElementNS("urn:iso:std:iso-iec:24727:tech:schema", "Pin");
	elemPin4.setTextContent("0000");
	
	Element elemOldPin4 = d4.createElementNS("urn:iso:std:iso-iec:24727:tech:schema", "OldPin");
	elemOldPin4.setTextContent("0000");

	Element elemAdminPin4 = d4.createElementNS("urn:iso:std:iso-iec:24727:tech:schema", "AdminPin");
	elemAdminPin4.setTextContent("000000");

	DIDUpdateDataType didUpdateData4 = new DIDUpdateDataType();

	didUpdateData4.getAny().add(elemPin4);
	didUpdateData4.getAny().add(elemOldPin4);
	didUpdateData4.getAny().add(elemAdminPin4);

	didUpdateData4.setProtocol(ECardConstants.Protocol.PIN_COMPARE);
	parameters4.setConnectionHandle(result.getConnectionHandle());
 	parameters4.setDIDUpdateData(didUpdateData4);

	DIDUpdateResponse result4 = instance.didUpdate(parameters4);
	assertEquals(ECardConstants.Major.OK, result4.getResult().getResultMajor());

    }

    /**
     * Test of didAuthenticate method, of class TinySAL.
     *
     * @throws ParserConfigurationException
     */
    @Test(priority = 8)//8
    public void testDidAuthenticate2() throws ParserConfigurationException {
	System.out.println("didAuthenticate, PIN ADMIN");

	// get path to IRMA
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_IRMA);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to IRMA
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult()
		.get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);

	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	DIDAuthenticate parameters = new DIDAuthenticate();
	parameters.setDIDName("PIN.ADMIN");
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	factory.setNamespaceAware(true);
	DocumentBuilder builder = factory.newDocumentBuilder();
	Document d = builder.newDocument();
	Element elemPin = d.createElementNS("urn:iso:std:iso-iec:24727:tech:schema", "Pin");
	elemPin.setTextContent("000000");
	DIDAuthenticationDataType didAuthenticationData = new DIDAuthenticationDataType();
	didAuthenticationData.getAny().add(elemPin);

	parameters.setAuthenticationProtocolData(didAuthenticationData);
	parameters.setConnectionHandle(result.getConnectionHandle());
	didAuthenticationData.setProtocol(ECardConstants.Protocol.PIN_COMPARE);
	parameters.setAuthenticationProtocolData(didAuthenticationData);
	DIDAuthenticateResponse result1 = instance.didAuthenticate(parameters);

	assertEquals(result1.getAuthenticationProtocolData().getProtocol(), ECardConstants.Protocol.PIN_COMPARE);
	assertEquals(ECardConstants.Major.OK, result1.getResult().getResultMajor());
	assertEquals(result1.getAuthenticationProtocolData().getAny().size(), 0);
    }

    /**
     * Test of didUpdate method, of class TinySAL.
     */
    @Test(priority = 9) //9
    public void testDidUpdate2() throws ParserConfigurationException {
	System.out.println("didUpdate, PIN ADMIN, change PIN from 000000 to 111111 -- connecting");

	// get path to IRMA
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_IRMA);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to IRMA
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult()
		.get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);

	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	System.out.println("didUpdate, PIN ADMIN, change PIN from 000000 to 111111 -- connected");

	// change PIN from 000000 to 111111

        DIDUpdate parameters = new DIDUpdate();
	parameters.setDIDName("PIN.ADMIN");
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	factory.setNamespaceAware(true);
	DocumentBuilder builder = factory.newDocumentBuilder();
	Document d = builder.newDocument();

	Element elemPin = d.createElementNS("urn:iso:std:iso-iec:24727:tech:schema", "Pin");
	elemPin.setTextContent("111111");
	
	Element elemOldPin = d.createElementNS("urn:iso:std:iso-iec:24727:tech:schema", "OldPin");
	elemOldPin.setTextContent("000000");

	Element elemAdminPin = d.createElementNS("urn:iso:std:iso-iec:24727:tech:schema", "AdminPin");
	elemAdminPin.setTextContent("000000");

	DIDUpdateDataType didUpdateData = new DIDUpdateDataType();

	didUpdateData.getAny().add(elemPin);
	didUpdateData.getAny().add(elemOldPin);
	didUpdateData.getAny().add(elemAdminPin);

	didUpdateData.setProtocol(ECardConstants.Protocol.PIN_COMPARE);
	parameters.setConnectionHandle(result.getConnectionHandle());
 	parameters.setDIDUpdateData(didUpdateData);

	System.out.println("didUpdate, PIN ADMIN, change PIN from 000000 to 111111 -- updating");

	DIDUpdateResponse result1 = instance.didUpdate(parameters);
	assertEquals(ECardConstants.Major.OK, result1.getResult().getResultMajor());

	// check PIN 111111

	System.out.println("didUpdate, PIN ADMIN, change PIN from 000000 to 111111 -- checking new pin 111111");

	DIDAuthenticate parameters_check = new DIDAuthenticate();
	parameters_check.setDIDName("PIN.ADMIN");
	DocumentBuilderFactory factory_check = DocumentBuilderFactory.newInstance();
	factory_check.setNamespaceAware(true);
	DocumentBuilder builder_check = factory_check.newDocumentBuilder();
	Document d_check = builder_check.newDocument();
	Element elemPin_check = d_check.createElementNS("urn:iso:std:iso-iec:24727:tech:schema", "Pin");
	elemPin_check.setTextContent("111111");
	DIDAuthenticationDataType didAuthenticationData_check = new DIDAuthenticationDataType();
	didAuthenticationData_check.getAny().add(elemPin);

	parameters_check.setAuthenticationProtocolData(didAuthenticationData_check);
	parameters_check.setConnectionHandle(result.getConnectionHandle());
	didAuthenticationData_check.setProtocol(ECardConstants.Protocol.PIN_COMPARE);
	parameters_check.setAuthenticationProtocolData(didAuthenticationData_check);
	DIDAuthenticateResponse result1_check = instance.didAuthenticate(parameters_check);

	assertEquals(result1_check.getAuthenticationProtocolData().getProtocol(), ECardConstants.Protocol.PIN_COMPARE);
	assertEquals(ECardConstants.Major.OK, result1_check.getResult().getResultMajor());
	assertEquals(result1_check.getAuthenticationProtocolData().getAny().size(), 0);

        // change PIN from 111111 000000

        DIDUpdate parameters2 = new DIDUpdate();
	parameters2.setDIDName("PIN.ADMIN");
	DocumentBuilderFactory factory2 = DocumentBuilderFactory.newInstance();
	factory2.setNamespaceAware(true);
	DocumentBuilder builder2 = factory2.newDocumentBuilder();
	Document d2 = builder2.newDocument();

	Element elemPin2 = d2.createElementNS("urn:iso:std:iso-iec:24727:tech:schema", "Pin");
	elemPin2.setTextContent("000000");
	
	Element elemOldPin2 = d2.createElementNS("urn:iso:std:iso-iec:24727:tech:schema", "OldPin");
	elemOldPin2.setTextContent("111111");

	Element elemAdminPin2 = d2.createElementNS("urn:iso:std:iso-iec:24727:tech:schema", "AdminPin");
	elemAdminPin2.setTextContent("000000");

	DIDUpdateDataType didUpdateData2 = new DIDUpdateDataType();

	didUpdateData2.getAny().add(elemPin2);
	didUpdateData2.getAny().add(elemOldPin2);
	didUpdateData2.getAny().add(elemAdminPin2);

	didUpdateData2.setProtocol(ECardConstants.Protocol.PIN_COMPARE);
	parameters2.setConnectionHandle(result.getConnectionHandle());
 	parameters2.setDIDUpdateData(didUpdateData2);

	System.out.println("didUpdate, PIN ADMIN, change PIN from 111111 to 000000 -- updating");

	DIDUpdateResponse result2 = instance.didUpdate(parameters2);
	assertEquals(ECardConstants.Major.OK, result2.getResult().getResultMajor());
    }

    /**
     * Test of aclList method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testAclList() {
	System.out.println("aclList");
	// get path to esign
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_ESIGN);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult()
		.get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	ACLList aclList = new ACLList();
	aclList.setConnectionHandle(result.getConnectionHandle());
	TargetNameType targetName = new TargetNameType();
	targetName.setCardApplicationName(appIdentifier_ESIGN);
	aclList.setTargetName(targetName);
	ACLListResponse aclListResponse = instance.aclList(aclList);
	assertEquals(aclListResponse.getResult().getResultMajor(), ECardConstants.Major.OK);
	assertTrue(aclListResponse.getTargetACL().getAccessRule().size()>0);

	// test null connectionhandle
	aclList = new ACLList();
	aclList.setConnectionHandle(null);
	targetName = new TargetNameType();
	targetName.setCardApplicationName(appIdentifier_ESIGN);
	aclList.setTargetName(targetName);
	aclListResponse = instance.aclList(aclList);
	assertEquals(ECardConstants.Major.ERROR, aclListResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.App.INCORRECT_PARM, aclListResponse.getResult().getResultMinor());

	// test missing targetname
	aclList = new ACLList();
	aclList.setConnectionHandle(null);
	targetName = new TargetNameType();
	aclList.setTargetName(targetName);
	aclListResponse = instance.aclList(aclList);
	assertEquals(ECardConstants.Major.ERROR, aclListResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.App.INCORRECT_PARM, aclListResponse.getResult().getResultMinor());

	//test invalid applicationIdentifier
	aclList = new ACLList();
	aclList.setConnectionHandle(result.getConnectionHandle());
	targetName = new TargetNameType();
	targetName.setCardApplicationName(new byte[]{0x0, 0x0, 0x0});
	aclList.setTargetName(targetName);
	aclListResponse = instance.aclList(aclList);
	assertEquals(ECardConstants.Major.ERROR, aclListResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.SAL.NAMED_ENTITY_NOT_FOUND, aclListResponse.getResult().getResultMinor());

	//test invalid connectionhandle
	aclList = new ACLList();
	aclList.setConnectionHandle(result.getConnectionHandle());
	aclList.getConnectionHandle().setIFDName("invalid");
	targetName = new TargetNameType();
	targetName.setCardApplicationName(appIdentifier_ESIGN);
	aclList.setTargetName(targetName);
	aclListResponse = instance.aclList(aclList);
	assertEquals(ECardConstants.Major.ERROR, aclListResponse.getResult().getResultMajor());
	assertEquals(ECardConstants.Minor.SAL.UNKNOWN_HANDLE, aclListResponse.getResult().getResultMinor());
    }

    /**
     * Test of aclModify method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testAclModify() {
	System.out.println("aclModify");

	// get path to esign
	CardApplicationPath cardApplicationPath = new CardApplicationPath();
	CardApplicationPathType cardApplicationPathType = new CardApplicationPathType();
	cardApplicationPathType.setCardApplication(appIdentifier_ESIGN);
	cardApplicationPath.setCardAppPathRequest(cardApplicationPathType);
	CardApplicationPathResponse cardApplicationPathResponse = instance.cardApplicationPath(cardApplicationPath);

	// connect to esign
	CardApplicationConnect cardApplicationConnect = new CardApplicationConnect();
	cardApplicationConnect.setCardApplicationPath(cardApplicationPathResponse.getCardAppPathResultSet().getCardApplicationPathResult()
		.get(0));
	CardApplicationConnectResponse result = instance.cardApplicationConnect(cardApplicationConnect);
	assertEquals(ECardConstants.Major.OK, result.getResult().getResultMajor());

	ACLList aclList = new ACLList();
	aclList.setConnectionHandle(result.getConnectionHandle());
	TargetNameType targetName = new TargetNameType();
	targetName.setCardApplicationName(appIdentifier_ESIGN);
	aclList.setTargetName(targetName);
	ACLListResponse aclListResponse = instance.aclList(aclList);
	assertEquals(aclListResponse.getResult().getResultMajor(), ECardConstants.Major.OK);
	assertTrue(aclListResponse.getTargetACL().getAccessRule().size()>0);

        AccessRuleType accessRuleFirst = aclListResponse.getTargetACL().getAccessRule().get(0);
        String cardApplicationServiceName = accessRuleFirst.getCardApplicationServiceName();
        ActionNameType actionName = accessRuleFirst.getAction();
        assertEquals(actionName.getAPIAccessEntryPoint(), APIAccessEntryPointName.INITIALIZE);
        SecurityConditionType securityCondition = accessRuleFirst.getSecurityCondition();

        // modify first rule

	ACLModify parameters = new ACLModify();
	parameters.setConnectionHandle(result.getConnectionHandle());
        parameters.setTargetName(targetName);	
	parameters.setCardApplicationServiceName(cardApplicationServiceName);

        actionName.setAPIAccessEntryPoint(APIAccessEntryPointName.TERMINATE);	
	parameters.setActionName(actionName);
	parameters.setSecurityCondition(securityCondition);
	
	ACLModifyResponse resultACLModify = instance.aclModify(parameters);
	assertEquals(ECardConstants.Major.OK, resultACLModify.getResult().getResultMajor());

	// Check modify

	aclList = new ACLList();
	aclList.setConnectionHandle(result.getConnectionHandle());
	aclList.setTargetName(targetName);
	aclListResponse = instance.aclList(aclList);
	assertEquals(aclListResponse.getResult().getResultMajor(), ECardConstants.Major.OK);
	assertTrue(aclListResponse.getTargetACL().getAccessRule().size()>0);

        accessRuleFirst = aclListResponse.getTargetACL().getAccessRule().get(0);
        assertEquals(actionName.getAPIAccessEntryPoint(), APIAccessEntryPointName.TERMINATE);

        // Undo modify

	parameters = new ACLModify();
	parameters.setConnectionHandle(result.getConnectionHandle());
        parameters.setTargetName(targetName);	
	parameters.setCardApplicationServiceName(cardApplicationServiceName);

        actionName.setAPIAccessEntryPoint(APIAccessEntryPointName.INITIALIZE);	
	parameters.setActionName(actionName);
	parameters.setSecurityCondition(securityCondition);
	
	resultACLModify = instance.aclModify(parameters);
	assertEquals(ECardConstants.Major.OK, resultACLModify.getResult().getResultMajor());

	// Check modify

	aclList = new ACLList();
	aclList.setConnectionHandle(result.getConnectionHandle());
	aclList.setTargetName(targetName);
	aclListResponse = instance.aclList(aclList);
	assertEquals(aclListResponse.getResult().getResultMajor(), ECardConstants.Major.OK);
	assertTrue(aclListResponse.getTargetACL().getAccessRule().size()>0);

        accessRuleFirst = aclListResponse.getTargetACL().getAccessRule().get(0);
        assertEquals(actionName.getAPIAccessEntryPoint(), APIAccessEntryPointName.INITIALIZE);	
    }

    /**
     * Test of singalEvent method, of class TinySAL.
     */
    @Test(enabled=false)
    public void testSingalEvent() {
	System.out.println("singalEvent");
	// same as getconnectionhandles, so call this one instead
	testGetConnectionHandles();
    }

    final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
    
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        int v;
        
        for ( int j = 0; j < bytes.length; j++ ) {
            v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        
        return new String(hexChars);
    }
}
