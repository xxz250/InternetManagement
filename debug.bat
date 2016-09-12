cls
@echo off
cls
GOTO DEBUG
:DEBUG
echo Debug 测试工具
echo ====================================================
echo                     功能模块列表
echo.                
echo 1.登录  2.退出  3.退出测试工具
echo.
echo ******************** 设备管理 *******************
echo.
echo 4.局址  5.机房  6.机架   7.厂商   8.设备类型   
echo 9.局址下机房    10.局址下机架     11.局址下设备
echo 12.机房下机架   13.机架下设备     14.厂商下设备
echo 15.设备类型下设备
echo.
echo ******************** IP管理 *********************
echo.
echo 16.IP   17.IP映射  18.IP是否占用  19.某IP映射信息
echo 20.资源池  21.设备占用IP
echo.
echo ====================================================

set /p ID=请输入测试接口序号：
if %ID%==1 goto login
if %ID%==2 goto out
if %ID%==3 goto exit
if %ID%==4 goto getAllSite
if %ID%==5 goto getAllRoom
if %ID%==6 goto getAllRack
if %ID%==7 goto getAllVendor
if %ID%==8 goto getAllEquipmentType
if %ID%==9 goto roomOfSite
if %ID%==10 goto rackOfSite
if %ID%==11 goto equipOfSite
if %ID%==12 goto rackOfRoom
if %ID%==13 goto equlpmentOfRack
if %ID%==14 goto equipmentOfVendor
if %ID%==15 goto equipOfEquipType
if %ID%==16 goto getAllIp
if %ID%==17 goto getAllMap
if %ID%==18 goto isOccupyOfIp
if %ID%==19 goto ipMapOfMapID
if %ID%==20 goto getAllResPool
if %ID%==21 goto ipOfEquipID


pause

:login
set /p NAME=请输入用户名： 
set /p ID=请输入密码：
echo 正在登陆......
curl -D E:/chinatelecom/testresult/cookie.txt -d "name=%NAME%&passwd=%ID%" http://localhost:8080/InternetManagement/loginManager/isLogin
echo 已登录！！！
goto DEBUG

:out
echo 正在退出......
curl http://localhost:8080/InternetManagement/loginManager/quit
del E:\chinatelecom\testresult\cookie.txt
echo 已退出！！！
goto DEBUG

:exit
del E:\chinatelecom\testresult\cookie.txt
exit

:getAllSite
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt http://localhost:8080/InternetManagement/equipManager/getAllSite>E:/chinatelecom/testresult/GetAllSite.txt
echo 查询结果已写到文本文件！！！
goto DEBUG

:getAllRoom
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt http://localhost:8080/InternetManagement/equipManager/getAllRoom>E:/chinatelecom/testresult/GetAllRoom.txt
echo 查询结果已写到文本文件！！！
goto DEBUG

:getAllRack
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt http://localhost:8080/InternetManagement/equipManager/getAllRack>E:/chinatelecom/testresult/GetAllRack.txt
echo 查询结果已写到文本文件！！！
goto DEBUG

:getAllVendor
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt http://localhost:8080/InternetManagement/equipManager/getAllVendor>E:/chinatelecom/testresult/GetAllVendor.txt
echo 查询结果已写到文本文件！！！
goto DEBUG

:getAllEquipmentType
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt http://localhost:8080/InternetManagement/equipManager/getAllEquipmentType>E:/chinatelecom/testresult/GetAllEquipmentType.txt
echo 查询结果已写到文本文件！！！
goto DEBUG

:roomOfSite
set /p ID=请输入局址ID：
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/equipManager/getAllRoomBySite>E:/chinatelecom/testresult/RoomOfSite.txt
echo 查询结果已写到文本文件！！！
goto DEBUG

:rackOfSite
set /p ID=请输入局址ID：
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/equipManager/getAllRackBySiteID>E:/chinatelecom/testresult/RackOfSite.txt
echo 查询结果已写到文本文件！！！
goto DEBUG

:equlpmentOfRack
set /p ID=请输入机架ID：
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/equipManager/getAllEqulpmentByRack>E:/chinatelecom/testresult/EqulpmentOfRack.txt
echo 查询结果已写到文本文件！！！
goto DEBUG

:rackOfRoom
set /p ID=请输入机房ID：
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/equipManager/getAllRackByRoom>E:/chinatelecom/testresult/RackOfRoom.txt
echo 查询结果已写到文本文件！！！
goto DEBUG

:equipmentOfVendor
set /p ID=请输入厂商ID：
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/equipManager/getAllEquipmentByVendorID>E:/chinatelecom/testresult/EquipmentOfVendor.txt
echo 查询结果已写到文本文件！！！
goto DEBUG

:equipOfEquipType
set /p ID=请输入设备类型ID：
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/equipManager/getAllEquipByEquipType>E:/chinatelecom/testresult/EquipOfEquipType.txt
echo 查询结果已写到文本文件！！！
goto DEBUG


:equipOfSite
set /p ID=请输入局址ID：
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/equipManager/getAllEquipBySiteID>E:/chinatelecom/testresult/EquipOfSite.txt
echo 查询结果已写到文本文件！！！
goto DEBUG

:getAllIp
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt http://localhost:8080/InternetManagement/ipManager/getAllIp>E:/chinatelecom/testresult/GetAllIp.txt
echo 查询结果已写到文本文件！！！
goto DEBUG

:getAllMap
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt http://localhost:8080/InternetManagement/ipManager/getAllMap>E:/chinatelecom/testresult/GetAllMap.txt
echo 查询结果已写到文本文件！！！
goto DEBUG

:getAllResPool
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt http://localhost:8080/InternetManagement/ipManager/getAllResPool>E:/chinatelecom/testresult/GetAllResPool.txt
echo 查询结果已写到文本文件！！！
goto DEBUG

:ipMapOfMapID
set /p ID=请输入映射ID：
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/ipManager/getIpMapByMapID>E:/chinatelecom/testresult/IpMapOfMapID.txt
echo 查询结果已写到文本文件！！！
goto DEBUG

:ipOfEquipID
set /p ID=请输入设备ID：
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/ipManager/getIpByEquipID>E:/chinatelecom/testresult/IpOfEquipID.txt
echo 查询结果已写到文本文件！！！
goto DEBUG

:isOccupyOfIp
set /p ID=请输入资源池ID：
set /p IP=请输入IP地址：
echo 正在查询......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%&ipid=%IP%" http://localhost:8080/InternetManagement/ipManager/IsOccupyOfIp>E:/chinatelecom/testresult/IsOccupyOfIp.txt
echo 查询结果已写到文本文件！！！
goto DEBUG
