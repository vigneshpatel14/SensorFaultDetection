from setuptools import find_packages,setup

#Set up tools is basically a package the provides tools for python packages

from typing import List

def get_requirements(file_path:str) -> List[str]:
    requirements = []
    with open(file_path) as file_object:
        requirements = file_object.readlines()
        requirements = [req.replace("\n" , "") for req in requirements]
    if HYPEN_E_DOT in requirements:
        requirements.remove(HYPEN_E_DOT)
    return requirements


HYPEN_E_DOT = '-e.'

setup(
name='Fault detection',
version= '0.0.1',
author= 'Vignesh',
author_mail= 'vigneshpatel0707@gmail.com',
install_requirements = get_requirements("requirements.txt"),
packages=find_packages()

)