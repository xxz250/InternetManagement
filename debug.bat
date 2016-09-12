cls
@echo off
cls
GOTO DEBUG
:DEBUG
echo Debug ���Թ���
echo ====================================================
echo                     ����ģ���б�
echo.                
echo 1.��¼  2.�˳�  3.�˳����Թ���
echo.
echo ******************** �豸���� *******************
echo.
echo 4.��ַ  5.����  6.����   7.����   8.�豸����   
echo 9.��ַ�»���    10.��ַ�»���     11.��ַ���豸
echo 12.�����»���   13.�������豸     14.�������豸
echo 15.�豸�������豸
echo.
echo ******************** IP���� *********************
echo.
echo 16.IP   17.IPӳ��  18.IP�Ƿ�ռ��  19.ĳIPӳ����Ϣ
echo 20.��Դ��  21.�豸ռ��IP
echo.
echo ====================================================

set /p ID=��������Խӿ���ţ�
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
set /p NAME=�������û����� 
set /p ID=���������룺
echo ���ڵ�½......
curl -D E:/chinatelecom/testresult/cookie.txt -d "name=%NAME%&passwd=%ID%" http://localhost:8080/InternetManagement/loginManager/isLogin
echo �ѵ�¼������
goto DEBUG

:out
echo �����˳�......
curl http://localhost:8080/InternetManagement/loginManager/quit
del E:\chinatelecom\testresult\cookie.txt
echo ���˳�������
goto DEBUG

:exit
del E:\chinatelecom\testresult\cookie.txt
exit

:getAllSite
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt http://localhost:8080/InternetManagement/equipManager/getAllSite>E:/chinatelecom/testresult/GetAllSite.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG

:getAllRoom
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt http://localhost:8080/InternetManagement/equipManager/getAllRoom>E:/chinatelecom/testresult/GetAllRoom.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG

:getAllRack
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt http://localhost:8080/InternetManagement/equipManager/getAllRack>E:/chinatelecom/testresult/GetAllRack.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG

:getAllVendor
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt http://localhost:8080/InternetManagement/equipManager/getAllVendor>E:/chinatelecom/testresult/GetAllVendor.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG

:getAllEquipmentType
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt http://localhost:8080/InternetManagement/equipManager/getAllEquipmentType>E:/chinatelecom/testresult/GetAllEquipmentType.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG

:roomOfSite
set /p ID=�������ַID��
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/equipManager/getAllRoomBySite>E:/chinatelecom/testresult/RoomOfSite.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG

:rackOfSite
set /p ID=�������ַID��
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/equipManager/getAllRackBySiteID>E:/chinatelecom/testresult/RackOfSite.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG

:equlpmentOfRack
set /p ID=���������ID��
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/equipManager/getAllEqulpmentByRack>E:/chinatelecom/testresult/EqulpmentOfRack.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG

:rackOfRoom
set /p ID=���������ID��
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/equipManager/getAllRackByRoom>E:/chinatelecom/testresult/RackOfRoom.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG

:equipmentOfVendor
set /p ID=�����볧��ID��
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/equipManager/getAllEquipmentByVendorID>E:/chinatelecom/testresult/EquipmentOfVendor.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG

:equipOfEquipType
set /p ID=�������豸����ID��
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/equipManager/getAllEquipByEquipType>E:/chinatelecom/testresult/EquipOfEquipType.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG


:equipOfSite
set /p ID=�������ַID��
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/equipManager/getAllEquipBySiteID>E:/chinatelecom/testresult/EquipOfSite.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG

:getAllIp
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt http://localhost:8080/InternetManagement/ipManager/getAllIp>E:/chinatelecom/testresult/GetAllIp.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG

:getAllMap
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt http://localhost:8080/InternetManagement/ipManager/getAllMap>E:/chinatelecom/testresult/GetAllMap.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG

:getAllResPool
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt http://localhost:8080/InternetManagement/ipManager/getAllResPool>E:/chinatelecom/testresult/GetAllResPool.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG

:ipMapOfMapID
set /p ID=������ӳ��ID��
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/ipManager/getIpMapByMapID>E:/chinatelecom/testresult/IpMapOfMapID.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG

:ipOfEquipID
set /p ID=�������豸ID��
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%" http://localhost:8080/InternetManagement/ipManager/getIpByEquipID>E:/chinatelecom/testresult/IpOfEquipID.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG

:isOccupyOfIp
set /p ID=��������Դ��ID��
set /p IP=������IP��ַ��
echo ���ڲ�ѯ......
curl -b E:/chinatelecom/testresult/cookie.txt -d "nameid=%ID%&ipid=%IP%" http://localhost:8080/InternetManagement/ipManager/IsOccupyOfIp>E:/chinatelecom/testresult/IsOccupyOfIp.txt
echo ��ѯ�����д���ı��ļ�������
goto DEBUG
